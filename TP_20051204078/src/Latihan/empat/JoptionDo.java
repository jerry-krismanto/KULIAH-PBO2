package Latihan.empat;

import javax.swing.JOptionPane;

public class JoptionDo {
    public static void main(String[] args) {
        String koefisien = "";
        String pangkat = "";
        int hasil = 1;
        int i =1;

        koefisien = JOptionPane.showInputDialog("MASUKAN KOEFISIEN");
        int koefisienx = Integer.valueOf(koefisien).intValue();
        pangkat = JOptionPane.showInputDialog("MASUKAN PANGKAT");
        int pangkatx = Integer.valueOf(pangkat).intValue();

        do{
            hasil = hasil*koefisienx;
            i++;
        }while(pangkatx >= i );
        String fix = koefisienx + " pangkat " + pangkatx + " =" +hasil;
        JOptionPane.showMessageDialog(null,fix);
    }
}
