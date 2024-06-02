// Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.latihan19_testshape;

public class Shape {
    // Private member variable
    private String color;

    /** Constructs a Shape instance with the given color */
    public Shape (String color) {
       this.color = color;
    }

    /** Returns a self-descriptive string */   
    @Override
    public String toString() {
       return "Shape[color=" + color + "]";
    }

    /** All shapes must provide a method called getArea() */
    public double getArea() {
       // We have a problem here!
       // We need to return some value to compile the program.
       System.err.println("Shape unknown! Cannot compute area!");
       return 0;
   }
}