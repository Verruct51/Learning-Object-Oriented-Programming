//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.jobsheet10;
public class Latihan03_InformatikaUNP {
    public static void main(String[] args){
        Latihan03_Mahasiswa informatika = new Latihan03_Mahasiswa();
        Latihan03_Mahasiswa elektronika = new Latihan03_Mahasiswa();
        
        informatika.nama = "Happy Alicia";
        informatika.nim = 1;
        informatika.jur = "S1 Informatika";
        informatika.univ = "Universitas Negeri Padang";
        
        elektronika.nama = "Wilson";
        elektronika.nim = 2;
        elektronika.jur = "S1 Elektronika";
        elektronika.univ = "Universitas Negeri Padang";
        
        System.out.println("Data Mahasiswa Informatika");
        System.out.println("Nama : " + informatika.nama);
        System.out.println("NIM : " + informatika.nim);
        System.out.println("Jurusan : " + informatika.jur);
        System.out.println("Universitas : " + informatika.univ);
        
        System.out.println("-----------------------------------");
        
        System.out.println("Data Mahasiswa Elektronika");
        System.out.println("Nama : " + elektronika.nama);
        System.out.println("NIM : " + elektronika.nim);
        System.out.println("Jurusan : " + elektronika.jur);
        System.out.println("Universitas : " + elektronika.univ);
    }
}
