//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.jobsheet05;
import java.util.Scanner;
public class Latihan02 {
    public static void main (String []args){
        float angka1, angka2, jumlah;
        Scanner dataMasuk = new Scanner (System.in);
        
        System.out.print("Masukkan Angka Ke-1 : ");
        angka1 = dataMasuk.nextFloat();
        
        System.out.print("Masukkan Angka Ke-2 : ");
        angka2 = dataMasuk.nextFloat();
        
        jumlah = angka1 + angka2;
        
        System.out.println("Angka Ke-1 : " + angka1);
        System.out.println("Angka Ke-2 : " + angka2);
        System.out.println("Jumlah : " + jumlah);
    }    
}
