//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.jobsheet05;
import javax.swing.JOptionPane;
public class Latihan05 {
    public static void main (String[]args){
        String name = "", hoby = "";
        
        name = JOptionPane.showInputDialog("Nama Anda : ");
        hoby = JOptionPane.showInputDialog("Hobi Anda : ");
        
        String msg = "Jadi Hoby Anda "+hoby+" " + "Hobi yang bagus " +name;
        
        JOptionPane.showMessageDialog(null, msg);
        System.out.println("Jadi Hobi Anda "+hoby+" Hobi yang bagus" +name);
    }
    
}
