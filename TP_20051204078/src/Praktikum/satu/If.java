package Praktikum.satu;

public class If {
    public static void main(String[] args) {
        double grade = 92.0;
        if(grade >= 90){
            System.out.println("EXCELLENT!");
        }else if ((grade < 90) && (grade >= 80)){
            System.out.println("GOOD JOB");
        }else if ((grade < 80) && (grade >= 60)) {
            System.out.println("STUDY HARDER!!!");
        }else{
            System.out.println("YOU FOOL DUDE!!!");
        }
    }
}
