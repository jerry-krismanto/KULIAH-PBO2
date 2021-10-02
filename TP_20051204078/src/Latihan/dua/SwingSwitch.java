package Latihan.dua;

import javax.swing.JOptionPane;


public class SwingSwitch {
    public static void main(String[] args) {
        String nilai = "";
        int Nilai = 0;

        nilai = JOptionPane.showInputDialog(null, "MASUKAN NILAI    :"+nilai);

        String pesan_x ="";

        Nilai = Integer.parseInt(nilai);
        switch(Nilai){
            case 1 : pesan_x = "VALID!!" ; break;
            case 2 : pesan_x = "VALID!!" ; break;
            case 3 : pesan_x = "VALID!!" ; break;
            case 4 : pesan_x = "VALID!!" ; break;
            case 5 : pesan_x = "VALID!!" ; break;
            case 6 : pesan_x = "VALID!!" ; break;
            case 7 : pesan_x = "VALID!!" ; break;
            case 8 : pesan_x = "VALID!!" ; break;
            case 9 : pesan_x = "VALID!!" ; break;
            case 10 : pesan_x = "VALID!!"; break;
            default : pesan_x = "INVALID"; break;
        }
        JOptionPane.showMessageDialog(null,pesan_x);
    }

}
