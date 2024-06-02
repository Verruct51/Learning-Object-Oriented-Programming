//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.latihan09_testball;

import java.util.Arrays;

public class Latihan09_TestBall {

     public static void main(String[] args) {
        // Test constructor and toString()
        Ball b1 = new Ball(1, 2, 11, 12);
        System.out.println(b1);  // toString()
        //Ball@(1.0,2.0),speed=(11.0,12.0)

        // Test Setters and Getters
        b1.setX(3);
        b1.setY(4);
        b1.setXStep(13);
        b1.setYStep(14);
        System.out.println(b1);
        //Ball@(3.0,4.0),speed=(13.0,14.0)
        System.out.println("x is: " + b1.getX());
        //x is: 3.0
        System.out.println("y is: " + b1.getY());
        //y is: 4.0
        System.out.println("xStep is: " + b1.getXStep());
        //xStep is: 13.0
        System.out.println("yStep is: " + b1.getYStep());
        //yStep is: 14.0

        // Test setXY(), getXY(), setXYStep(), getXYStep()
        b1.setXY(5, 6);
        b1.setXYStep(15, 16);
        System.out.println(b1);  // toString()
        //Ball@(5.0,6.0),speed=(15.0,16.0)
        System.out.println("x and y are: " + Arrays.toString(b1.getXY()));  // use utility to print array
        //x and y are: [5.0, 6.0]
        System.out.println("xStep and yStep are: " + Arrays.toString(b1.getXYStep()));
        //xStep and yStep are: [15.0, 16.0]

        // Test move() and chaining
        System.out.println(b1.move());  // toString()
        //Ball@(20.0,22.0),speed=(15.0,16.0)
        System.out.println(b1.move().move().move());
        //Ball@(65.0,70.0),speed=(15.0,16.0)
    }
}
