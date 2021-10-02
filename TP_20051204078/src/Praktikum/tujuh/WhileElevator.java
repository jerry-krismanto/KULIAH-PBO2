package Praktikum.tujuh;

public class WhileElevator {
    public boolean doorOpen = false;
    public int currentFloor = 1;
    public final int top_floor = 5;
    public final int bottom_floor =1;
    public void openDoor(){
        System.out.println("OPENING DOOR");
        doorOpen =true;
        System.out.println("DOOR IS OPEN");
    }
    public void closeDoor(){
        System.out.println("CLOSSING DOOR");
        doorOpen=false;
        System.out.println("DOOR IS CLOSSED");
    }
    public void goUp(){
        System.out.println("GOING UP ONE FLOOR");
        currentFloor++;
        System.out.println("FLORR:"+currentFloor);
    }
    public void goDown(){
        System.out.println("GOING DOWN ONE FLOOR");
        currentFloor--;
        System.out.println("FLOOR"+currentFloor);
    }
    public void setFloor(){
        int desiredFloor= 5;
        while (currentFloor!= desiredFloor){
            if(currentFloor < desiredFloor){
                goUp();
            }else {
                goDown();
            }
        }
    }
}