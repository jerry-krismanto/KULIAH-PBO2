package Latihan.dua;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Read2 {
    public static void main(String[] args) {
        String input = "";
        int hasil = 0;

        try{
            BufferedReader niggas = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("MASUKAN NILAI :");
            input = niggas.readLine();
        }catch (IOException e){
            System.out.print("ERROR!!!");
        }
        hasil = Integer.parseInt(input);
        switch (hasil){
            case 1 :{
                System.out.print("SATU |VALID!!|");
                break;
            }
            case 2 :{
                System.out.print("DUA |VALID!!|");
                break;
            }
            case 3 :{
                System.out.print("TIGA |VALID!!|");
                break;
            }
            case 4 :{
                System.out.print("EMPAT |VALID!!|");
                break;
            }
            case 5 :{
                System.out.print("LIMA |VALID!!|");
                break;
            }
            case 6 :{
                System.out.print("ENAM |VALID!!|");
                break;
            }
            case 7 :{
                System.out.print("TUJUH |VALID!!|");
                break;
            }
            case 8 :{
                System.out.print("DELAPAN |VALID!!|");
                break;
            }
            case 9 :{
                System.out.print("DUA |VALID!!|");
                break;
            }
            case 10 :{
                System.out.print("SEPULUH |VALID!!|");
                break;
            }
            default : {
                System.out.print("INVALID!!");
                break;
            }
        }
    }
}
