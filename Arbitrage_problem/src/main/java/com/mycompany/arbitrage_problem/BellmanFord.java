package com.mycompany.arbitrage_problem;

import com.mycompany.arbitrage_problem.Graph;

/**
 *
 * @author C A T E C H
 */
public class BellmanFord {
    public BellmanFord(Graph graph,int src) // algorithme de bellman ford
    {
        int V = graph.getVertices().length;
        int E = graph.getEdges().size();
        double dist[] = new double[V];
        int lastNode[] = new int[V];
        int output[] = new int[V];
        for (int i=0; i<V; ++i){
            dist[i] = Integer.MAX_VALUE;
            output[i] = -1;
        }
        dist[src] = 0;
        
        for (int i=1; i<V; ++i)
        {
            for (int j=0; j<E; ++j)
            {
                int u = graph.getEdges().get(j).getStart()-1;
                int v = graph.getEdges().get(j).getDestination()-1;
                double weight = graph.getEdges().get(j).getWeight();
                if (dist[u]!=Integer.MAX_VALUE && dist[u]+weight<dist[v]){
                    dist[v]=dist[u]+weight;
                    lastNode[v] = u;
                }
            }
        }
        int cycleNo = 0;
        for (int j=0; j<E; ++j)       // calcul poids négative
        {
            int u = graph.getEdges().get(j).getStart()-1;
            int v = graph.getEdges().get(j).getDestination()-1;
            double weight = graph.getEdges().get(j).getWeight();
            if (dist[u] != Integer.MAX_VALUE && dist[u]+weight < dist[v]){
                cycleNo++;
            }
        }
        //
        System.out.println("Graph contient " + cycleNo + " negative poids cycles.");
        int prev = 0;
        int index = 0;
        for(int i : lastNode){
            if(i == prev) continue;
            prev = i;
            output[index] = i;
            index++;
        }
        System.out.print("Les sommets qui forment les opportunités d'arbitrage: ");
        for(int i: output)
            if(i != -1)
                System.out.print(i + ", ");
    }
}
