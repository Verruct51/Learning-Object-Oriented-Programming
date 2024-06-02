//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.jobsheet10;
public class Latihan01_MobilUtama {
    public static void main(String[] args){
        Latihan01_Mobil Honda = new Latihan01_Mobil();
        Honda.merk = "Civic";
        Honda.warna = "Hitam";
        Honda.tahunproduksi = 2020;
        System.out.println("Merk\t: " + Honda.merk);
        System.out.println("Warna\t: " + Honda.warna);
        System.out.println("Tahun\t: " + Honda.tahunproduksi);
        Honda.Maju();
        Honda.Maju();
        Honda.Mundur();
    }
}
