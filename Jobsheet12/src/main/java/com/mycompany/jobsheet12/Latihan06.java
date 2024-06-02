//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.jobsheet12;

class EncapsulationBuah {
    //data members of class EncapsulationBuah
    private String namaBuah;
    private String hargaBuah;
    private String warnaBuah;
    
    //declaration of contructor
    public EncapsulationBuah(String namaBuah, String hargaBuah, String warnaBuah) {
        this.namaBuah = namaBuah;
        this.hargaBuah = hargaBuah;
        this.warnaBuah = warnaBuah;
    }
    
    //declaring setter for all fields
    public void setName(String namaBuah) {
        this.namaBuah = namaBuah;
    }
    public void setPrice(String hargaBuah) {
        this.hargaBuah = hargaBuah;
    }
    public void setColor(String warnaBuah) {
        this.warnaBuah = warnaBuah;
    }
    //declaring getter for all fields
    public String getName() {
        return namaBuah;
    }
    public String getPrice() {
        return hargaBuah;
    }
    public String getColor() {
        return warnaBuah;
    }
}

public class Latihan06 {
     public static void main(String[] args) {
        // menggunakan contructor untuk menginisialisasi
        EncapsulationBuah Apel = new EncapsulationBuah("Apel","Rp. 3000","Merah");
        // menggunakan getter ke nilai
        System.out.println("Nama Buah : " + Apel.getName() + "\nHarga : " + Apel.getPrice() + "\nWarna : " + Apel.getColor());
        // update harga dan warna menggunakan setter
        Apel.setColor("Hijau");
        Apel.setPrice("Rp. 7000");
        System.out.println("\nInformasi Terkait Apel Setelah Di Update");
        // menggunakan getter untuk mendapatkan nilai
        System.out.println("Nama Buah : " + Apel.getName() + "\nHarga : " + Apel.getPrice() + "\nWarna : " + Apel.getColor());
    }
}

