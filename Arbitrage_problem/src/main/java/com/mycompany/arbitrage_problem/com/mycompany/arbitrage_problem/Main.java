package com.mycompany.arbitrage_problem;
import java.io.File;
import com.mycompany.arbitrage_problem.BellmanFord;
import com.mycompany.arbitrage_problem.Graph;
import com.mycompany.arbitrage_problem.ReadF;
import java.util.Scanner;                // implementation des biliotheques nécéssaire
                                         // scanner, math, IOexeption, FileWriter.... 
import java.io.IOException;
import java.io.FileWriter;
import static java.lang.Math.log;
/**
 *
 * @author C A T E C H
 */
public class Main {
    
    
 
    private final int vertices;                    // declaration des arcs et de la matrice d'adjacence
    private double [][] adjacency_matrix;
 
    public Main(int v) 
    {
        vertices = v;
        adjacency_matrix = new double [vertices + 1][vertices + 1];
    }
 
    public void makeEdge(int to, int from, double edge)   // cette procedure a pour un bur de remplir les sommets,
                                                          // les arcs avec poids associer a chaque un
                                                          // dans le graph
    {
        try 
        {
            adjacency_matrix[to][from] = edge;
        }
        catch (ArrayIndexOutOfBoundsException index) 
        {
            System.out.println("cet arc ne peut pas exister !");
        }
    }
 
    public double getEdge(int to, int from)         // fonction recuperation des arcs
    {
        try 
        {
            return adjacency_matrix[to][from];
        }
        catch (ArrayIndexOutOfBoundsException index) 
        {
            System.out.println("cet arc n'existe pas");
        }
        return -1;
    }
   

    
     public static void main(String args[]) {
        
        
       int v = 0, e, count = 1, to = 0, from = 0 ;
       double  poidsR =0.0 , poidsC=0.0 ;
       int a[][] = null;
        Scanner sc = new Scanner(System.in);
        Main graph = null;
        try 
        {
            System.out.println("Enter le nombre d'arc: ");
            v = sc.nextInt();
            System.out.println("Enter le nombre des sommets: ");
            e = sc.nextInt();
 
            graph = new Main(v);
 
            System.out.println("Enter les sommets celon cet ordre s'il vou plait: <to> ESPACE <from> ESPACE  <poid> ENTRRE");
            while (count <= v) 
            {
                to = sc.nextInt();          // lecture des sommets debut-fin (arcs) 
                from = sc.nextInt();
                poidsR= sc.nextDouble();    // poids de chaque arc
 
                  // le poids est sous ca originale format
                graph.makeEdge(to, from, poidsR);
                
                if(to==from){
                    graph.makeEdge(to, from, 1);  // pour la diagonal de la matrice
                }
                count++;
            }
 
               System.out.println("l'ensemble des arcs est: \n");
            for(int i=1 ; i<=v ; i++){
                
                for(int j=1 ; j<=v ; j++){
                
                    if(graph.getEdge(i, j)!=1 || graph.getEdge(i, j)!=0.0 ){
                        
                     
                        System.out.println("de :"   +i+   "\ta :"   +j+   "     poid :"    +graph.getEdge(i, j));
                    }
                
            }
                
            }
            
            System.out.println("\n");
            
            
            
            
            System.out.println("La matrice d'adjacence du graphe pondéré est: ");  //affichage
            System.out.print("  ");                                        // de la matrice
            for (int i = 1; i <= v; i++)                                   // d'adjacence
                System.out.print(i + " ");
            System.out.println();
 
            for (int i = 1; i <= v; i++) 
            {
                System.out.print(i + " ");
                for (int j = 1; j <= v; j++) 
                {
                   
                        if(i!=j){
                            
                            System.out.print(graph.getEdge(i, j) + " ");
                            
                        }else{
                            graph.makeEdge(i, j, 1);
                            System.out.print("1 ");
                            
                        }
                    
                    
                  
                        
                    
                }
                System.out.println();
                
            }
 
        }
        catch (Exception E) 
        {
            System.out.println("probleme...");
        }
 
        sc.close();
        

        
   
        
        
        
    
        ///////////////////////////////
        
        /* vous trouverez si dessous une partie de code 
        non demandé qui joue simplement le role archive suplementaire
        pour une raison d'historique surtout dans le domaine monnaie*/
        
       ///////////////////////////////
    
    
    
    
    try {
     File myObj = new File("Matrice.txt");
     
      if (myObj.createNewFile()) {
        System.out.println("Fichier crée: " + myObj.getName());
      } else {
        System.out.println("Fichier existe deja dans le repértoire ====> ECRASEMENT.");
      }
      } catch (IOException eb) {
      System.out.println("probléme....");
      eb.printStackTrace();
    }
  
     

        
        
        ////// enregistrement dans l'archive
        try {
            
      FileWriter myWriter = new FileWriter("Matrice.txt");
      
      
      
      
      for(int i=1 ; i<=v ; i++){
    for(int j=1 ; j<=v ; j++){
        if(i!=j){
        if(j>=v){
       
      myWriter.write(graph.getEdge(i,j)+"\n");
      
        }else{
          
        myWriter.write(graph.getEdge(i, j)+"\t");
            
        }
    }else{
            
            
             if(j>=v){
       
      myWriter.write((int)graph.getEdge(i,j)+"\n");
      
        }else{
          
        myWriter.write((int)graph.getEdge(i, j)+"\t");
            
        }
            
            
            
        }}}
      
      myWriter.close();
      System.out.println("ecriture avec succes.");
      
              
    } catch (IOException eb) {
      System.out.println("erreur......");
      eb.printStackTrace();
    }
        
        
        
        
    
    

       
        
        
        /// auto lecture de fichier
        //  avec le respect de la qeustion 3
        ReadF rf = new ReadF("Matrice.txt");
        Graph g = rf.makeGraph();
//        for(int i : g.getVertices()){
//           BellmanFord bl = new BellmanFord(g, i-1); 
//        }
        BellmanFord bl = new BellmanFord(g, 0); // application bellman ford
    
    
    
    
    
    
    
    
    
}
}