//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.jobsheet05;
import javax.swing.JOptionPane;
public class Tugas02 {
    public static void main (String[]args){
        String kata1 = "", kata2 = "", kata3 = "";
        
        kata1 = JOptionPane.showInputDialog("Masukkan Kata 1 : ");
        kata2 = JOptionPane.showInputDialog("Masukkan Kata 2 : ");
        kata3 = JOptionPane.showInputDialog("Masukkan Kata 3 : ");
        
        String msg = " " + kata1 + " " + kata2 + " " + kata3;
        
        JOptionPane.showMessageDialog(null,msg);
    }    
}
