package com.mycompany.arbitrage_problem;
import java.util.ArrayList;

/**
 *
 * @author C A T E C H
 */
public class Graph {         // structure de graph // il est caractériser par sommets nommé edges
                                                   // aussi caractériser par arcs nommé vertices
                                                   // orionté est pondéré
    private ArrayList<Sommet> edges;
    private int[] vertices;
    public Graph(ArrayList<Sommet> edges, int vertices){
        this.edges = edges;
        this.vertices = new int[vertices];
        for(int i=0; i< vertices; i++){
            this.vertices[i] = i+1;
        }
    }

    public ArrayList<Sommet> getEdges() {
        return edges;
    }

    public int[] getVertices() {
        return vertices;
    }
    
}
