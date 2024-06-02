//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.jobsheet12;

class kendaraan {
    double hargaDasar = 1000000;
    public void tampilkanHarga(){
        System.out.println("Harga kendaraan adalah Rp." + hargaDasar);
    }
}

class rodaDua extends kendaraan{
    double NaikHargaKe = 0.20; //0.2 kali
    void hargaAkhir(){
        hargaDasar = hargaDasar + (hargaDasar * NaikHargaKe);
        System.out.println("Setelah dimodifikasi, harga sepeda menjadi Rp." + hargaDasar);
    }
}

class rodaEmpat extends kendaraan{
    double NaikHargaKe = 8; //1 kali
    void hargaAkhir(){
        hargaDasar = hargaDasar + (hargaDasar * NaikHargaKe);
        System.out.println("Setelah dimodifikasi, harga mobil menjadi Rp." + hargaDasar);
    }
}

public class Latihan01 {
    public static void main(String[]args){
        //membuat objek kendaraan roda dua
        rodaDua sepeda = new rodaDua();
        //membuat objek kendaraan roda empat
        rodaEmpat mobil = new rodaEmpat();
        
        sepeda.tampilkanHarga();
        sepeda.hargaAkhir();
        
        mobil.tampilkanHarga();
        mobil.hargaAkhir();
    }
}
