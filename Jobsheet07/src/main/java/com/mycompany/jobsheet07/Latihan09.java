//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.jobsheet07;
public class Latihan09 {
    public static void main(String[]args){
        int baris, kolom, hasil_kali;
        int MAKS = 8;
        
        for (baris =1; baris <= MAKS; baris++){
            for (kolom = 1; kolom <= MAKS; kolom++){
                hasil_kali = baris * kolom;
                System.out.println("\t" + hasil_kali);
            }
            System.out.println("");
        }
        
    }
}
