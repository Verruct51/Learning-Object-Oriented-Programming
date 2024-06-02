//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.jobsheet06;
import java.util.Scanner;
public class Latihan01 {
    public static void main (String[]args){
        double total_pembelian,diskon = 0, total;
        
        Scanner dataMasuk = new Scanner (System.in);
        System.out.print("Masukkan total pembelian : Rp ");
        total_pembelian = dataMasuk.nextDouble();
        
        if (total_pembelian >= 50000)
            diskon = 0.1 * total_pembelian;
        
        System.out.println("Besarnya diskon : Rp " + diskon);
    }
    
}
