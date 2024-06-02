//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.jobsheet04;
public class Latihan06 {
    public static void main (String[]args){
        String status= "";
        int grade = 50;
        
        //mendapatkan status pelajar
        status = (grade >= 60) ? "Passed" : "Fail";
        
        //print status
        System.out.println(status);
    }
}
