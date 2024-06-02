// Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.latihan13_testline;
import java.awt.Point;

public class Line {
    // The private instance variables
    Point begin, end;   // instances of the "Point" class

    /** Constructs a Line instance given 2 points at (x1, y1) and (x2, y2) */
    public Line(int x1, int y1, int x2, int y2) {
        begin = new Point(x1, y1);
        end = new Point(x2, y2);
    }

    /** Construct a Line instance given 2 Point instances */
    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    // The public getter and setter for the private instance variables
    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.x;
    }

    public void setBeginX(int x) {
        begin.x = x;
    }

    public int getBeginY() {
        return begin.y;
    }

    public void setBeginY(int y) {
        begin.y = y;
    }

    public int[] getBeginXY() {
        return new int[]{begin.x, begin.y};
    }

    public void setBeginXY(int x, int y) {
        begin.setLocation(x, y);
    }

    public int getEndX() {
        return end.x;
    }

    public void setEndX(int x) {
        end.x = x;
    }

    public int getEndY() {
        return end.y;
    }

    public void setEndY(int y) {
        end.y = y;
    }

    public int[] getEndXY() {
        return new int[]{end.x, end.y};
    }

    public void setEndXY(int x, int y) {
        end.setLocation(x, y);
    }

    /** Returns a self-descriptive String */
    public String toString() {
        return "Line[begin=" + begin + ",end=" + end + "]";
    }

    /** Returns the length of this line */
    public double getLength() {
        return begin.distance(end);
    }
}