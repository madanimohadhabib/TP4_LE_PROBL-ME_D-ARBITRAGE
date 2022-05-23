package com.mycompany.arbitrage_problem;

import com.mycompany.arbitrage_problem.Sommet;
import com.mycompany.arbitrage_problem.Graph;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author C A T E C H
 */
public class ReadF {            
    private BufferedReader br;
    public ReadF(String path){
        try { 
            File file = new File(path);
            this.br = new BufferedReader(new FileReader(file));
        }catch(Exception  e){
            System.err.println(e);
        }
    }
    public Graph makeGraph(){  // cette fonction pour crée un graph 
        try{
            String line;
            String[] weights = new String[0];
            int i = 0;
            ArrayList<Sommet> edges = new ArrayList<>();
            while ((line = this.br.readLine()) != null) {
                i++;
                weights = line.split("\\s+");
                for(int j=0; j< weights.length; j++){
                    // on a un graph avec poids.
                    // on change le poids sous format -log(poids)
                    double weight = -(Math.log(Double.parseDouble(weights[j]))/Math.log(2));
                    Sommet eg = new Sommet(i, j+1, weight);
                    edges.add(eg);
                }
            }
            return new Graph(edges, weights.length);
        }catch(Exception e){
            System.err.println(e);
            return null;
        }
    }
}
