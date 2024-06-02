//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.jobsheet10;
public class Latihan04_Aktor {
     String nama;
    int umur;
    
    Latihan04_Aktor(String n, int u){
        nama=n;
        umur=u;
    }
    
    void tampilAktor(){
        System.out.println("Namaku : " + nama);
        System.out.println("Umurku : " + umur + " tahun");
    }
    
    public static void main(String args[]){
        Latihan04_Aktor a;
        
        a = new Latihan04_Aktor("Ronaldo",33);
        a.tampilAktor();
        System.out.println("==========");
                
        a = new Latihan04_Aktor("Messi",34);
        a.tampilAktor();
        System.out.println("==========");
    }
}
