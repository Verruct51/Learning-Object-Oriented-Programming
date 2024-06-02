// Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.latihan18_testlinesub;

public class Latihan18_TestLineSub {

    public static void main(String[] args) {
         // Test constructors and toString()
        LineSub l1 = new LineSub(1, 2, 3, 4);
        System.out.println(l1);  // toString()
        
        LineSub l2 = new LineSub(new Point(5, 6), new Point(7, 8));
        System.out.println(l2);

        // Test Setters and Getters
        l1.setBegin(new Point(11, 12));
        l1.setEnd(new Point(13, 14));
        System.out.println(l1);  // toString()
        System.out.println("begin is: " + l1.getBegin());
        System.out.println("end is: " + l1.getEnd());

        l1.setBeginX(21);
        l1.setBeginY(22);
        l1.setEndX(23);
        l1.setEndY(24);
        System.out.println(l1);
        System.out.println("begin's x is: " + l1.getBeginX());
        System.out.println("begin's y is: " + l1.getBeginY());
        System.out.println("end's x is: " + l1.getEndX());
        System.out.println("end's y is: " + l1.getEndY());

        l1.setBeginXY(31, 32);
        l1.setEndXY(33, 34);
        System.out.println(l1);  // toString()
        System.out.println("begin's x is: " + l1.getBegin().getX());
        System.out.println("begin's y is: " + l1.getBegin().getY());
        System.out.println("end's x is: " + l1.getEnd().getX());
        System.out.println("end's y is: " + l1.getEnd().getY());

        // Test getLength()
        System.out.printf("length is: %.2f%n", l1.getLength());
    }
}
