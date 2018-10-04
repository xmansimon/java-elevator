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
    private static final int capacity = 10;
    private  int currentFloor; // elevator starts from 1st floor
    private  boolean direction; // false go up, true go down
    private  int[][] destination = new int[8][2]; 

    private int passengerInElevator; //total number of passenger in the elvator
/**
* Constructor
*/
    public Elevator(Building building){
    }

/**
* move method
*/
    public void move(){
        if(direction == false){ // go up 
            currentFloor++;
        }else{
            currentFloor--;
       }
        if(currentFloor == floorNumber){ // change direction if elevator reaches top
           direction = true;  
        }else if(currentFloor == 1){ // change direction if elevator reaches 1st floor
           direction = false; 
       }
        destination[currentFloor][1] = 0; // clears number of people destined for the current floor. 
        System.out.println(toString());
    }
/**
* @param destinationFloor Passenger destination floor 
*/
    public void boardPassenger(int destinationFloor) throws ElevatorFullException{
        try{
            destination[destinationFloor][0] = destinationFloor;  // set the first column to be the destined floor.
            destination[destinationFloor][1]++;  // set second column as number of people destined to the floor. 
            passengerInElevator = 0; //reset total passenger variable
            for(int i =0; i < destination.length; i++){
                passengerInElevator = destination[i][1] + passengerInElevator; // 1st column ist the number of people
            }
    
 
        }catch(ElevatorFullException efe){
            if(passengerInElevator = capacity){
                throw new ElevatorFullException("Elevator reaches full capacity", efe.getCause());
            }

        }
       
    }

    public String toString(){
        int totalNum = 0; //calculate total number of people in the elevator. 
        for(int i = 0; i < destination.length; i++){
            totalNum = destination[i][1] + totalNum; //second column is the number of people
        } 
        return "Floor " +currentFloor+ ": "+totalNum + " Passengers";
    }


    public int getCurrentFloor(){
        return this.currentFloor;
    }

    public int getPassengers(){
        return passengerInElevator;
    }


}
