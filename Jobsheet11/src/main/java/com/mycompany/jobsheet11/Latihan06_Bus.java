//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.jobsheet11;
public class Latihan06_Bus {
    private int penumpang;
    private int maxPenumpang;
    
    public Latihan06_Bus(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang + penumpang;
        if (temp > maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }
        else {
            this.penumpang = temp;
        }
    }
    
    public void cetak(){
        System.out.println("Penumpang bus sekarang : " + penumpang);
        System.out.println("Penumpang maks seharusnya : " + maxPenumpang);
    }
}
