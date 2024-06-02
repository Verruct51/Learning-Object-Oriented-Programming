//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.jobsheet06;
import javax.swing.JOptionPane;
public class Tugas01_b {
    public static void main (String[]args){
        float nilai1, nilai2, nilai3, rataRata;
        
        String inputNilai1 = JOptionPane.showInputDialog("Masukkan nilai 1 : ");
        String inputNilai2 = JOptionPane.showInputDialog("Masukkan nilai 2 : ");
        String inputNilai3 = JOptionPane.showInputDialog("Masukkan nilai 3 : ");
        
        nilai1 = Float.parseFloat(inputNilai1);
        nilai2 = Float.parseFloat(inputNilai2);
        nilai3 = Float.parseFloat(inputNilai3);
        
        rataRata = (nilai1 + nilai2 + nilai3)/3;
        
        String emoticon;
        if (rataRata >= 60){
            emoticon = ":-)";
        }
        else{
            emoticon = ":-(";
        }
        
        String msg = "Nilai rata-rata : " + rataRata + " " + emoticon;
        JOptionPane.showMessageDialog(null,msg);
    }    
    
}
