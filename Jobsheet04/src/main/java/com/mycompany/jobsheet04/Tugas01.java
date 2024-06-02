//Created by 22343019_Alvin Anugerah Pratama

/*
 Buatlah program yang menghasilkan output nilai rata-rata dari tiga angka. Nilai
 dari masing- masing tiga angka tersebut adalah 10, 20 dan 45
*/
package com.mycompany.jobsheet04;
public class Tugas01 {
    public static void main (String[]args){
        int a = 10, b = 20, c = 45;
        float hasil;
      
        System.out.println ("Nilai 1 : " + a);
        System.out.println ("Nilai 2 : " + b);
        System.out.println ("Nilai 3 : " + c);
        
        hasil = (a + b + c)/3;
        System.out.println ("Rata-rata dari ketiga nilai : " +hasil); 
    }    
}
