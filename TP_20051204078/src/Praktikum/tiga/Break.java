package Praktikum.tiga;


public class Break {
    public static void main(String[] args) {
        String nama[] = {"BEAH", "GESH","BIANCA", "LANCE", "BELLIE", "NICO",
    "YZA", "GEM", "ETHAN"};
        String carinama = "YZA";
        boolean ketemunama = false;
        for (int i=0 ; i < nama.length;i=i+1){
            if (nama[i].equals(carinama)){
                ketemunama = true;
                break;
            }
        }
        if (ketemunama){
            System.out.println(carinama+"NAMA TERSEBUT ADA!!!");
        }else {
            System.out.println(carinama +"TIDAK DITEMUKAN!!");
        }
    }
}
