//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.jobsheet10;
import java.util.Scanner;
public class Latihan02_Manusia {
    String nama, tempat_lahir, tgl_lahir;
    double berat_badan, tinggi_badan; // Menggunakan double untuk berat_badan dan tinggi_badan
    
    public void inputdata() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Lengkap\t: ");
        nama = input.nextLine();
        System.out.print("Masukkan Tempat Lahir\t: ");
        tempat_lahir = input.nextLine();
        System.out.print("Masukkan Tanggal Lahir\t: ");
        tgl_lahir = input.nextLine();
        System.out.print("Masukkan Berat Badan\t: ");
        berat_badan = input.nextDouble(); // Menggunakan input.nextDouble() untuk mengambil nilai berat_badan
        System.out.print("Masukkan Tinggi Badan\t: ");
        tinggi_badan = input.nextDouble(); // Menggunakan input.nextDouble() untuk mengambil nilai tinggi_badan
    }

    public void identitas() {
        System.out.println("Nama saya \t: " + nama);
        System.out.println("Tempat lahir \t: " + tempat_lahir);
        System.out.println("Tanggal lahir \t: " + tgl_lahir);
        System.out.println("Berat badan \t: " + berat_badan);
        System.out.println("Tinggi badan \t: " + tinggi_badan);
    }

    public static void main(String[] args) {
        Latihan02_Manusia A = new Latihan02_Manusia();
        A.inputdata();
        A.identitas();
    }
}
