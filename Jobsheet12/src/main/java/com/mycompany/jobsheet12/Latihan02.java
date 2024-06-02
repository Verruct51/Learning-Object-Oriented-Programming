//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.jobsheet12;

class compileTime{
    //method keliling dengan single argumen
    static int keliling (int a){
        return 4 * a;
    }
    //method keliling dengan dua argumen (method overloading)
    static int keliling (int l, int b){
        return 2 * (l + b);
    }
}

public class Latihan02 {
    public static void main(String[]args){
        // Memanggil metode keliling dengan satu argumen
        System.out.println("Sisi Persegi adalah : 4 \nKeliling Persegi adalah : " + compileTime.keliling(4) + "\n");

        // Memanggil metode keliling dengan dua argumen
        System.out.println("Sisi Persegi Panjang adalah : 10, 13 \nKeliling Persegi Panjang adalah : " + compileTime.keliling(10, 13));    
    }
}
