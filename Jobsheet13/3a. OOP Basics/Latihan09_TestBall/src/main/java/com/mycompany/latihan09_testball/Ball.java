//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.latihan09_testball;

public class Ball {
    // The private instance variables
    private double x, y, xStep, yStep;

    /** Constructs a Ball instance with the given input */
    public Ball(double x, double y, double xStep, double yStep) {
       this.x = x;
       this.y = y;
       this.xStep = xStep;
       this.yStep = yStep;
    }

    // The public getters and setters for the private variables
    public double getX() {
       return this.x;
    }
    public void setX(double x) {
       this.x = x;
    }
    public double getY() {
       return this.y;
    }
    public void setY(double y) {
       this.y = y;
    }
    public double getXStep() {
       return this.xStep;
    }
    public void setXStep(double xStep) {
       this.xStep = xStep;
    }
    public double getYStep() {
       return this.yStep;
    }
    public void setYStep(double yStep) {
       this.yStep = yStep;
    }

    /** Returns a self-descriptive String */
    public String toString() {
       return "Ball@(" + x + "," + y + "),speed=(" + xStep + "," + yStep + ")";
    }

    /** Returns the x and y position in a 2-element double array */
    public double[] getXY() {
       double[] results = new double[2];
       results[0] = this.x;
       results[1] = this.y;
       return results;
    }
    /** Sets the x and y position */
    public void setXY(double x, double y) {
       this.x = x;
       this.y = y;
    }
    /** Returns the xStep and yStep in a 2-element double array */
    public double[] getXYStep() {
       double[] results = new double[2];
       results[0] = this.xStep;
       results[1] = this.yStep;
       return results;
    }
    /** Sets the xStep and yStep */
    public void setXYStep(double xStep, double yStep) {
       this.xStep = xStep;
       this.yStep = yStep;
    }

    /** Moves a step by increment x and y by xStep and yStep, respectively.
        Return "this" instance to support chaining operation. */
    public Ball move() {
       x += xStep;
       y += yStep;
       return this;
    }
}
