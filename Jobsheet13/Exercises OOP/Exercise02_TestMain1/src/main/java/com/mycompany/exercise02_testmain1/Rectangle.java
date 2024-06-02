//Created By_22343019_Alvin Anugerah Pratama

package com.mycompany.exercise02_testmain1;

public class Rectangle {
      // Private instance variables
    private float length;
    private float width;

    // Constructors
    public Rectangle() {
        this.length = 1.0f;  // default length
        this.width = 1.0f;   // default width
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    // Getters and Setters
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    // Other methods
    public float getArea() {
        return length * width;
    }

    public float getPerimeter() {
        return 2 * (length + width);
    }

    // toString() method
    @Override
    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }
}
