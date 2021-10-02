package Praktikum.lima;


public class ContinueStatement {
    public static void main(String[] args) {
        String nama []= {"AYU", "DINDA","WANDAH","LAURENCE"};
        int count = 0;
        for (int i=0;i<nama.length;i++){
            if( !nama[i].equals("DINDA")){
                continue;
            }
            count++;
        }
        System.out.println("There Are"+ count + "DINDA IN THE LIST");
    }
}