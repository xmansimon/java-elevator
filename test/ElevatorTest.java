package cscie55.hw1.test;
/**
* This is a test file. 
*
*/
import cscie55.hw1.elevator.Elevator;;

public class ElevatorTest{

    public static void main(String[] argv){
        Elevator elevator1 = new Elevator();
        elevator1.boardPassenger(3);
        elevator1.boardPassenger(3);
        elevator1.boardPassenger(5);

        for(int i = 0; i <= 12;i++){
            elevator1.move();
        
        }
    }
}