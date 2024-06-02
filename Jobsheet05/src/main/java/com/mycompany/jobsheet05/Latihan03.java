//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.jobsheet05;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Latihan03 {
    public static void main (String[]args){
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String name = "", hoby ="";
        
        try{
            System.out.print("Nama Anda : ");
            name = dataIn.readLine();
            System.out.print("Hobi Anda : ");
            hoby = dataIn.readLine();            
        }
        
        catch (IOException e){
            System.out.println("Gagal membaca keyboard");
        }
        System.out.println("Jadi Hobi Anda " +hoby+ " Hobi yang Bagus " +name);
    }  
}
