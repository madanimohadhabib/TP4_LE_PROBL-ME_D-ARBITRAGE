package com.mycompany.arbitrage_problem;


public class Sommet {
   private int start;
   private int destination;
   private double weight;
   public Sommet(int start, int destination, double weight){
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
