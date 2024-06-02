//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.jobsheet10;
class Maha {
    String nama;
    int nim, smt;
    double IP;

    Maha(String nama, int nim, int smt, float IP) {
        this.nama = nama;
        this.nim = nim;
        this.smt = smt;
        this.IP = IP;
    }
    
    int hitungSKS() {
        if (IP >= 3.5) {
            return 24;
        } else if (IP >= 3.0) {
            return 22;
        } else if (IP >= 2.5) {
            return 20;
        } else if (IP >= 2.0) {
            return 18;
        } else {
            return 15;
        }
    }

    String angkaRomawi(int angka) {
        String[] romawi = {
            "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"
        };
        return romawi[angka - 1];
    }

    void infoMahasiswa() {
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Semester: " + angkaRomawi(smt));
        System.out.println("IP Semester ini: " + IP);
        System.out.println("Anda berhak mengontrak " + hitungSKS() + " SKS pada Semester " + angkaRomawi(smt));
    }
}

public class Mahasiswa {
    public static void main(String[] args) {
        Maha joni = new Maha("Joni", 12345, 5, (float)3.4);
        joni.infoMahasiswa();
    }
}
