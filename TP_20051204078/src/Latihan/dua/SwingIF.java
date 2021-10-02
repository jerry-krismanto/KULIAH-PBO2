package Latihan.dua;

import javax.swing.JOptionPane;

public class SwingIF {
    public static void main(String[] args) {
        String nilai = "";
        int Nilai = 0;

        nilai = JOptionPane.showInputDialog(null, "MASUKAN NILAI    :"+nilai);

        String pesan_x ="";

        Nilai = Integer.parseInt(nilai);
        if ((Nilai > 0) && (Nilai <= 10)){
            pesan_x = "valid number!!";
        }else {
            pesan_x = "invalid number!!";
        }
        JOptionPane.showMessageDialog(null,pesan_x);
    }
}
