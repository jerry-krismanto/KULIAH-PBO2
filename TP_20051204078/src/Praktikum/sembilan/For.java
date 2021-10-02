package Praktikum.sembilan;

public class For {
    public boolean doorOpen = false;
    public int currentFloor = 1;
    public final int TOP_FLOOR = 5;
    public final int BOTTOM_FLOOR =1;

    public void openDoor(){
        System.out.println("Opening Door");
        doorOpen =true;
        System.out.println("Door is open");
    }
    public void closeDoor(){
        System.out.println("Closing Door");
        doorOpen =false;
        System.out.println("Door is close");
    }
    public void goUp(){
        System.out.println("Going up one floor");
        currentFloor++;
        System.out.println("Floor:"+currentFloor);
    }
    public void goDown(){
        System.out.println("Going down one floor");
        currentFloor--;
        System.out.println("Floor:"+currentFloor);
    }
    public void setFloor(){
        int desiredFloor =5;
        if(currentFloor > desiredFloor){
            for (int down = currentFloor;down != desiredFloor;--down){
                goDown();
            }
        }else{
            for (int up = currentFloor ; up != desiredFloor; ++up ){
                goUp();
            }
        }
    }

}