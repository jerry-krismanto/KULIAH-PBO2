package Praktikum.delapan;

public class WhileRectangle {
    public int height =3;
    public int width = 10;
    public void display(){
        int colCount =0;
        int rowCount =0;
        while(rowCount < height){
            colCount =0;
            while (colCount < width){
                System.out.println("0");
                colCount++;
            }
            System.out.println();
            rowCount++;
        }
    }
}


