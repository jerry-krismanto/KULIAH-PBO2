package Latihan.satu;
import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Nilai {
    
    static String nilai1 = "";
    static String nilai2 = "";
    static String nilai3 = "";
    static int avg =0;
    
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                System.out.println("MASUKAN NILAI 1 :");
                nilai1 = bufferedReader.readLine();
                System.out.println("MASUKAN NILAI 2 :");
                nilai2 = bufferedReader.readLine();
                System.out.println("MASUKAN NILAI 3 :");
                nilai3 = bufferedReader.readLine();
            } catch (Exception e) {
            System.out.println("INPUT ERROR!!");
        }
            try {
            avg = (Integer.parseInt(nilai1)+Integer.parseInt(nilai2)+Integer.parseInt(nilai3))/3;
            System.out.println("NILAI RATA-RATA :"+avg);
            if (avg >= 60){
                System.out.println("WAH HEBAT !!!");
            }else {
                System.out.println("BELAJAR LAGI!!!");
            }
        }   
            catch (NumberFormatException nfe){
            System.out.println("INPUT ERROR!!");
        }
    }
}

