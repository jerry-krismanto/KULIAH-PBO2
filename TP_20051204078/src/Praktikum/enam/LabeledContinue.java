package Praktikum.enam;

public class LabeledContinue{
    public static void main(String[] args) {
    
    outerLoop:
        for(int i =0;i<5;i++){
            for (int j=0;j<5;j++){
                System.out.println("INSIDE FOR (j)");
                if (j==2) continue outerLoop;
            }
            System.out.println("INSIDE FOR (i)");
        }
     }
 }