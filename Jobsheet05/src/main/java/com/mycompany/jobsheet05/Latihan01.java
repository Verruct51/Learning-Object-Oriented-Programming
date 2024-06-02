//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.jobsheet05;
import java.util.Scanner;
public class Latihan01 {
    public static void main (String[]args){
        Scanner in = new Scanner (System.in);
        
        System.out.print("Masukkan nama lengkap : ");
        String nama = in.nextLine();
        System.out.print("Masukkan NIM : ");
        int NIM = in.nextInt();
        System.out.print("Masukkan Nilai : ");
        float nilai = in.nextFloat();
        
        System.out.println("\nNama  : " + nama +
                           "\nNIM   : " + NIM  +
                           "\nNilai : " + nilai);
    }
    
}
