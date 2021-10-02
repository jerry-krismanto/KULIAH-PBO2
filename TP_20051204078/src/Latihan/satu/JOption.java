package Latihan.satu;

import javax.swing.JOptionPane;

public class JOption {
    public static void main(String[] args) {
        String nilai1 = "";
        String nilai2 = "";
        String nilai3 = "";
        int average = 0;
        
        nilai1 = JOptionPane.showInputDialog("MASUKAN NILAI PERTAMA :"+ nilai1);
        nilai2 = JOptionPane.showInputDialog("MASUKAN NILAI KEDUA :"+ nilai2);
        nilai3 = JOptionPane.showInputDialog("MASUKAN NILAI KETIGA  :"+ nilai3);


        try{
            average = (Integer.parseInt(nilai1)+ Integer.parseInt(nilai2)+Integer.parseInt(nilai3))/3;
            String pesan = "NILAI RATA-RATA :"+average;
            if (average >= 60){
                JOptionPane.showMessageDialog(null,"NILAI RATA-RATA ANDA    :"+pesan);
            }else {
                JOptionPane.showMessageDialog(null,"NILAI RATA-RATA ANDA    :"+pesan);
            }
        }catch (NumberFormatException nfe){
            String pesan = "ERROR!!";
            JOptionPane.showMessageDialog(null,pesan);
        }
    }
}
