//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.jobsheet05;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Latihan04 {
    public static void main (String[]args){
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String a, b;
        float angka1, angka2, jumlah;
        
        try {
            System.out.print("Masukkan Angka Pertama : ");
            a = dataIn.readLine();
            /* Data yang akan diproses aritmatika harus dikonversi dulu
               dari tipe data string ketipe data angka yang diperlukan 
               Data yang diperoleh dari inputan kelas BufferReader tipe datanya selalu String*/
            angka1 = Float.parseFloat(a);//Konversi dari string ke float
            
            System.out.print("Masukkan Angka Ke-2 : ");
            b = dataIn.readLine();
            angka2 = Float.parseFloat(b);
            
            jumlah = angka1 + angka2;
            System.out.println("Jumlah : " + jumlah);
        }
        catch (IOException e){
            System.out.println("Gagal membaca keyboard");
        }
    }    
}
