//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.jobsheet04;
public class Latihan04 {
    public static void main (String[]args){
        int i = 0;
        int j = 10;
        boolean test = true;
        
        //Demonstrasi ||
        test = (i < 10) || (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
        
        //Demonstrasi |
        test = (i < 10) | (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);                  
    }    
}
