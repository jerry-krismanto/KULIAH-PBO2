package Latihan.empat;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class PerpangkatanDo {
    public static void main(String[] args) {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String koefisien = "";
        String pangkat = "";
        double pangkat_x = 0;
        double hasil = 0;
        int i= 1;

        try{
            System.out.print("MASUKAN KOEFISIEN   :");
            koefisien = buff.readLine();
            System.out.print("MASUKAN PANGKAT :");
            pangkat = buff.readLine();
        }catch (IOException e){
            System.out.print("ERROR!!");
        }
        pangkat_x = Double.parseDouble(pangkat);
        do{
            hasil = Math.pow(Double.parseDouble(koefisien),pangkat_x);
            System.out.print(hasil);
            break;
        }while(pangkat_x >= i );
    }
 
}
