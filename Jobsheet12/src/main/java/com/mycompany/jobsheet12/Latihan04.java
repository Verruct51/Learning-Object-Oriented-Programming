//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.jobsheet12;

abstract class orang {
    public String namaAyah = "Randi Proska";
    abstract void makan();
    public void minum(){
        System.out.println("Minum air teh dan kopi");
    }   
}

class anakUmur1Tahun extends orang {
    public void namaAyahku(){
        System.out.println("Nama ayahku adalah :" + namaAyah);        
    }
    
    @Override
    public void makan(){
        System.out.println("Anak umur 1 tahun makan asi ");
    }
    
    @Override
    public void minum(){
        System.out.println("Anak umur 1 tahun minum asi ");
    }
}

class Latihan04 {
      public static void main(String[] args) {
        // object induk tidak bisa di buat disini
        
        // buat object anak umur 1 tahun baru
        anakUmur1Tahun a1 = new anakUmur1Tahun();
        
        // panggil method anak umur 1 tahun
        a1.makan();
        a1.minum();
        a1.namaAyahku();
        System.out.println();
    }   
}
