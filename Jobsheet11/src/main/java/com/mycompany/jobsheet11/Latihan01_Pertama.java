//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.jobsheet11;
public class Latihan01_Pertama {
     private int a = 10;
    
    protected void terprotek(){
        System.out.println("Method ini hanya untuk anaknya");
    }
    
    public void info(){
        System.out.println("a = " + a);
        System.out.println("Dipanggil pada = " + this.getClass().getName());
    }
}
