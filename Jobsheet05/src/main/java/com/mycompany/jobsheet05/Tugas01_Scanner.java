//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.jobsheet05;
import java.util.Scanner;
public class Tugas01_Scanner {
    public static void main (String[]args){
        Scanner kata = new Scanner(System.in);
        
        System.out.print("Masukkan Kata 1 : ");
        String kata1 = kata.nextLine();
        System.out.print("Masukkan Kata 2 : ");
        String kata2 = kata.nextLine();
        System.out.print("Masukkan Kata 3 : ");
        String kata3 = kata.nextLine();
        
        System.out.println( "\nHasil Gabungan Kata : " + kata1 + " " + kata2 + " " + kata3);
        
    }
}
