//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.jobsheet04;
public class Latihan02 {
     public static void main (String[]args){
        int i = 37;
        int j = 42;
        int k = 42;
        
        System.out.println ("Nilai variabel... ");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        
        //Lebih besar dari 
        System.out.println("Lebih besar dari...");
        System.out.println("i > j = " + (i > j)); //false
        System.out.println("j > i = " + (j > i)); //true
        System.out.println("k > j = " + (k > j)); //false
        
        //Lebih besar dari atau sama dengan
        System.out.println("Lebih besar dari atau sama dengan...");
        System.out.println("i >= j = " + (i >= j)); //false
        System.out.println("j >= i = " + (j >= i)); //true
        System.out.println("k >= j = " + (k >= j)); //true
        
        //Lebih kecil dari 
        System.out.println("Lebih kecil dari...");
        System.out.println("i < j = " + (i < j)); //true
        System.out.println("j < i = " + (j < i)); //false
        System.out.println("k < j = " + (k < j)); //false
        
        //Lebih kecil dari atau sama dengan
        System.out.println("Lebih kecil dari atau sama dengan...");
        System.out.println("i <= j = " + (i <= j)); //true
        System.out.println("j <= i = " + (j <= i)); //false
        System.out.println("k <= j = " + (k <= j)); //true
        
        //Sama dengan
        System.out.println("Sama dengan...");
        System.out.println("i == j = " + (i == j)); //false
        System.out.println("k == j = " + (k == j)); //true
        
        //Tidak sama dengan
        System.out.println("Tidak sama dengan...");
        System.out.println("i != j = " + (i != j)); //true
        System.out.println("k != j = " + (k != j)); //false
     }
}
