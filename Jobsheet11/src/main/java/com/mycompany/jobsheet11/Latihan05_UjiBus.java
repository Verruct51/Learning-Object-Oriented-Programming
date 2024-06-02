//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.jobsheet11;
public class Latihan05_UjiBus {
    public static void main(String args[]){
        Latihan05_Bus busMini = new Latihan05_Bus();
         busMini.penumpang = 5;
         busMini.maxPenumpang = 15;
        
        busMini.cetak();
        
        busMini.penumpang = busMini.penumpang + 5;
        busMini.cetak();
        
        busMini.penumpang = busMini.penumpang -2 ;
        busMini.cetak();
        
        busMini.penumpang = busMini.penumpang + 8;
        busMini.cetak();
        
    }
}
