//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.jobsheet06;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Tugas01_a {
    public static void main(String[]args){
        BufferedReader nilai = new BufferedReader (new InputStreamReader (System.in));
        
        float nilai1 = 0, nilai2 = 0, nilai3 = 0 , rataRata = 0;
        
        try{
            System.out.print("Masukkan Nilai 1 : ");
            nilai1 = Float.parseFloat(nilai.readLine());
            
            System.out.print("Masukkan Nilai 2 : ");
            nilai2 = Float.parseFloat(nilai.readLine());
            
            System.out.print("Masukkan Nilai 3 : ");
            nilai3 = Float.parseFloat(nilai.readLine());
    
        }
        catch(IOException e){
            System.out.println("gagal membaca keyboard");
        }
        
        rataRata = (nilai1 + nilai2 + nilai3)/3;
        System.out.println("Rata-rata : " + rataRata);
        
        if (rataRata >= 60){
            System.out.println(":-)");
        }
        else
            System.out.println(":-(");
    }
    
}
