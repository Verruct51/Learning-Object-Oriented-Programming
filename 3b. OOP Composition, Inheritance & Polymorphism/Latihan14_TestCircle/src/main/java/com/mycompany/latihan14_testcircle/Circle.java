// Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.latihan14_testcircle;

import java.awt.Point;

public class Circle {
    // The private member variables
    private Point center;  // Declare an instance of the "Point" class
    private double radius;

    // Constructors
    /** Constructs a Circle instance with the default values */
    public Circle() {
        this.center = new Point(); // Construct a Point at (0,0)
        this.radius = 1.0;
    }

    /** Constructs a Circle instance with the center at (xCenter, yCenter) and radius */
    public Circle(int xCenter, int yCenter, double radius) {
        center = new Point(xCenter, yCenter); // Construct a Point at (xCenter,yCenter)
        this.radius = radius;
    }

    /** Constructs a Circle instance with the given Point instance as center and radius */
    public Circle(Point center, double radius) {
        this.center = center;  // The caller had constructed a Point instance
        this.radius = radius;
    }

    // Getters and Setters
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return this.center;  // return a Point instance
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getCenterX() {
        return center.x;
    }

    public void setCenterX(int x) {
        center.x = x;
    }

    public int getCenterY() {
        return center.y;
    }

    public void setCenterY(int y) {
        center.y = y;
    }

    public int[] getCenterXY() {
        return new int[]{center.x, center.y};
    }

    public void setCenterXY(int x, int y) {
        center.setLocation(x, y);
    }

    /** Returns a self-descriptive String */
    public String toString() {
        return "Circle[center=" + center + ",radius=" + radius + "]";
    }

    /** Returns the area of this circle */
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /** Returns the circumference of this circle */
    public double getCircumference() {
        return 2.0 * Math.PI * radius;
    }

    /** Returns the distance from the center of this circle to the center of
     the given Circle instance called another */
    public double distance(Circle another) {
        return center.distance(another.center);  // Use distance() of the Point class
    }
}