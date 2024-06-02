// Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.latihan16_testpoint2dpoint3d;

public class Point3D extends Point2D {
    // Private instance variables
    private int z;

    // Constructors
    /** Constructs a Point3D instance at (0,0,0) */
    public Point3D() {  // default constructor
       super();     // x = y = 0
       this.z = 0;
    }
    /** Constructs a Point3D instance at (x,y,z) */
    public Point3D(int x, int y, int z) {
       super(x, y);
       this.z = z;
    }

    // Getters and Setters
    public int getZ() {
       return this.z;
    }
    public void setZ(int z) {
       this.z = z;
    }

    /** Returns a self-descriptive string in the form of "(x,y,z)" */
    @Override
    public String toString() {
       return "(" + super.getX() + "," + super.getY() + "," + this.z + ")";
    }
}