package cscie55.hw1.elevator;

/**
 *  Create fields for the class. 
 *  floorNumber: number of floors in the building, and set it to 7.
 *  currentFloor: a field for tracking the Elevator's current floor .
 *  direction: a field for tracking the Elevator's direction of travel.
 *  destination: the number of passengers destined for that floor.
 *  
 */
public class Elevator{
    private static final int floorNumber = 7;
    private static int currentFloor; // elevator starts from 1st floor
    private static boolean direction; // false go up, true go down
    private static int[][] destination = new int[8][2]; 


/**
* Constructor
*/
    public Elevator(){
    }

/**
* move method
*/
    public void move(){
       if(currentFloor == floorNumber){ // change direction if elevator reaches top
           direction = true;  
       }else if(currentFloor == 1){ // change direction if elevator reaches 1st floor
           direction = false; 
       }
        if(direction == false){ // go up 
            currentFloor++;
        }else{
            currentFloor--;
       }
       destination[currentFloor][1] = 0; // clears number of people destined for the current floor. 
       System.out.println(toString());
    }
/**
* @param destinationFloor Passenger destination floor 
*/
    public void boardPassenger(int destinationFloor){
        destination[destinationFloor][0] = destinationFloor;  // set the first column to be the destined floor.
        destination[destinationFloor][1]++;  // set second column as number of people destined to the floor. 
    }

    public String toString(){
        int totalNum = 0; //calculate total number of people in the elevator. 
        for(int i = 0; i < destination.length; i++){
            totalNum = destination[i][1] + totalNum; //second column is the number of people
        } 
        return "Floor " +currentFloor+ ": "+totalNum + " Passengers";
    }





}
