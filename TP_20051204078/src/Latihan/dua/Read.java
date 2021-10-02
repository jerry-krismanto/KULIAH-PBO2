package Latihan.dua;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//menggunakan perulangan if-else//

public class Read {
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
        if ((hasil > 0)&& (hasil <=10)){
            System.out.print("NILAI-"+hasil + "VALID!!!");
        }else{
            System.out.print("NILAI ERROR!!");
        }
    }
}
