//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.jobsheet12;

class Bank{
    float sukuBunga(){
        return 0;
    }
}

class BRI extends Bank{
    // overriding sukuBunga method
    float sukuBunga(){
        return 5.5f;
    }
}

class BNI extends Bank{
    //overriding sukuBunga method
    float sukuBunga(){
        return 10.6f;
    }
}

class Mandiri extends Bank{
    // overriding sukuBunga method
    float sukuBunga(){
        return 9.4f;
    }
}
class Latihan03 {
    public static void main(String[] args){
        // creating variable of Bank class
        Bank B;
        B = new BRI();
        System.out.println("Tingkat Suku Bunga BRI adalah : " + B.sukuBunga());
        B = new BNI();
        System.out.println("Tingkat Suku Bunga BNI adalah : " + B.sukuBunga());
        B = new Mandiri();
        System.out.println("Tingkat Suku Bunga Mandiri adalah : " + B.sukuBunga());
    }
}
