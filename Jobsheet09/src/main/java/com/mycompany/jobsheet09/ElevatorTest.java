//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.jobsheet09;
public class ElevatorTest {
    public static void main(String[] args){
        Latihan04 myElevator = new Latihan04();
        myElevator.openDoor();
        myElevator.closeDoor();
        myElevator.goUp();
        myElevator.goUp();
        myElevator.goUp();
        myElevator.openDoor();
        myElevator.closeDoor();
        myElevator.goDown();
        myElevator.openDoor();
        myElevator.closeDoor();
        myElevator.goDown();
        myElevator.setFloor(myElevator.TOP_FLOOR);
        myElevator.openDoor();    
    }
}
