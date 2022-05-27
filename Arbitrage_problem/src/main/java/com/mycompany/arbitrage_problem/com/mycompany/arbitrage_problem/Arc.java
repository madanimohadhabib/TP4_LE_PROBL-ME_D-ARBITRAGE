package com.mycompany.arbitrage_problem;


public class Arc {             // chaque arc est définis par un sommet début , fin et par poid
   private int start;
   private int destination;
   private double weight;
   public Arc(int start, int destination, double weight){
       this.start = start;
       this.destination = destination;
       this.weight = weight;
   }

    public int getStart() {
        return start;
    }

    public int getDestination() {
        return destination;
    }

    public double getWeight() {
        return weight;
    }
   
}
