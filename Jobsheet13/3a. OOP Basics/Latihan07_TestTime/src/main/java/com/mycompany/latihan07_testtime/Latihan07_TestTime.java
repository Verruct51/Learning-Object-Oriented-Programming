//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.latihan07_testtime;
import java.lang.Exception;

public class Latihan07_TestTime {
public static void main(String[] args) {
        int hour = 24, minute = 58, second = 58;
        Time t12;

        try {
            t12 = new Time(second, minute, hour);
            System.out.println("Valid input");
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
            System.out.println("Error in input. Set to default value");
            t12 = new Time();
        }

        System.out.println("Time is " + t12);
        System.out.println("Life goes on...");
    }
}
