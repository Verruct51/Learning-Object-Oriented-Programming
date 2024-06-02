//Created by 22343019_Alvin Anugerah Pratama

/*
 Diberikan tiga angka, tuliskan program yang menghasilkan output angka dengan nilai terbesar 
 diantara tiga angka tersebut. Gunakan operator kondisi (?:) yang telah kita pelajari sebelumnya 
 (HINT: Anda akan perlu menggunakan dua set operator ?: untuk memecahkan permasalahan ini). 
 Sebagai contoh , diberikan angka 10, 23 dan 5, Program anda akan menghasilkan output,
*/
package com.mycompany.jobsheet04;
public class Tugas02 {
    public static void main (String[] args) {
        int angka1 = 10, angka2 = 23, angka3 = 5;
        
        System.out.println ("number 1 = " + angka1);
        System.out.println ("number 2 = " + angka2);
        System.out.println ("number 3 = " + angka3);
        
        int status = (angka1 > angka2) ? ((angka1 > angka3) ? angka1 : angka3) : ((angka2 > angka3) ? angka2 : angka3);
        System.out.println ("Nilai tertingginya adalah angka = " + status );
    }
}
