//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.jobsheet11;
public class Latihan02_Employ extends Latihan02_Person{
    private String noKaryawan;
    
    //konstruktor
    public Latihan02_Employ(String noKaryawan, String name, int age) {
        super(name, age);
        this.noKaryawan = noKaryawan;
    }
    
    //metode
    public void info(){
        System.out.println("No. Karyawan : " + this.noKaryawan);
        super.info();
    }   
}
