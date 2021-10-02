package Praktikum.dua;

public class Switch {
    public static void main(String[] args) {
        int grade =92;
        switch(grade){
            case 100 :{
                System.out.println("EXCELLENT!!");
                break;
            }
            case 90:{
                System.out.println("GOOD JOB!!");
                break;
            }
            case 80:{
                System.out.println("STUDY HARDER!!!");
                break;
            }
            default : {
                System.out.println("YOU FOOL DUDE!!");
                break;
            }
        }
    }
}
