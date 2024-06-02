//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.jobsheet06;
import java.util.Scanner;
public class Tugas02_a {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka antara 1 hingga 10: ");
        int angka = input.nextInt();
        
        if (angka == 1) {
            System.out.println("Satu");
        } else if (angka == 2) {
            System.out.println("Dua");
        } else if (angka == 3) {
            System.out.println("Tiga");
        } else if (angka == 4) {
            System.out.println("Empat");
        } else if (angka == 5) {
            System.out.println("Lima");
        } else if (angka == 6) {
            System.out.println("Enam");
        } else if (angka == 7) {
            System.out.println("Tujuh");
        } else if (angka == 8) {
            System.out.println("Delapan");
        } else if (angka == 9) {
            System.out.println("Sembilan");
        } else if (angka == 10) {
            System.out.println("Sepuluh");
        } else {
            System.out.println("Invalid number");
        }

        input.close();
    }
}
