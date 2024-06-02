//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.jobsheet11;
public class Latihan03_Gajah {
    //meng-overwrite method pada Class Hewan
    public static void testClassMethod(){
        System.out.println("The Class Method in Hewan");
    }
    
    //meng-overwrite method pada class Hewan
    public void testInstanceMethod(){
        System.out.println("The Instance Method in Gajah");
    }
    
    public static void main(String args[]){
        Latihan03_Gajah myGajah = new Latihan03_Gajah();
        Latihan03_Gajah myHewan = myGajah;
        Latihan03_Hewan.testClassMethod();
        myHewan.testInstanceMethod();
    }
}

