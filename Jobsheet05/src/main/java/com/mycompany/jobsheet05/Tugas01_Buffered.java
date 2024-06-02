//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.jobsheet05;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Tugas01_Buffered {
    public static void main (String[]args){
        BufferedReader kata = new BufferedReader (new InputStreamReader (System.in));
        
        String kata1 = "", kata2 = "", kata3 = "";
        
        try{
            System.out.print("Masukkan Kata 1 : ");
            kata1 = kata.readLine();
            System.out.print("Masukkan Kata 2 : ");
            kata2 = kata.readLine();
            System.out.print("Masukkan Kata 3 : ");
            kata3 = kata.readLine();
        }
        catch(IOException e){
            System.out.println("Gagal membaca keyboard");
        }
        System.out.println("\nHasil Gabungan Kata : " + kata1 + " " + kata2 + " " + kata3);
    }
}
