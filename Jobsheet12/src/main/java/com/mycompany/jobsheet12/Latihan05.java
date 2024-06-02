//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.jobsheet12;

class AktivitasPagiAnak implements AktivitasPagi {
    @Override
    public void lari() {
        System.out.println("Aktivitas Pertama Pagi Ini Adalah Lari Pagi");
    }

    @Override
    public void berenang() {
        System.out.println("Aktivitas Kedua Pagi Ini Adalah Berenang");
    }
}

interface AktivitasPagi {
    void lari();
    void berenang();
}

public class Latihan05 {
    public static void main(String[] args) {
        AktivitasPagiAnak a1 = new AktivitasPagiAnak();
        
        //panggil method anak umur 1 tahun
        a1.lari();
        a1.berenang();
    }
}
