//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.jobsheet08;
import javax.swing.JOptionPane;

public class Tugas02 {
    public static void main(String[] args) {
        int[] nomor = new int[10];

        // Meminta pengguna memasukkan 10 nomor
        for (int i = 0; i < 10; i++) {
            String userInput = JOptionPane.showInputDialog("Masukkan nomor ke-" + (i + 1) + ":");
            try {
                nomor[i] = Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Masukkan nomor yang valid.");
                return;
            }
        }

        // Temukan nomor terbesar
        int maxNomor = nomor[0];
        for (int i = 1; i < 10; i++) {
            if (nomor[i] > maxNomor) {
                maxNomor = nomor[i];
            }
        }

        JOptionPane.showMessageDialog(null, "Nomor terbesar yang Anda masukkan adalah: " + maxNomor);
    }
}
