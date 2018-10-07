package cscie55.hw2;

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
<<<<<<< HEAD
    public static final int CAPACITY = 10;
    private int currentFloor = 1; // elevator starts from 1st floor
    private boolean direction; // false go up, true go down
    private int[] numberDestined = new int[8]; // number of people destined to certain floor. numberDestined[1] -> first floor. 
    private int passengerInElevator; //total number of passenger in the elvator
    private Building building; 
    /**
* Constructor
*/
    public Elevator(Building building){
        this.building = building; 
    }
    public Elevator(){
=======
    private static final int capacity = 10;
    private  int currentFloor; // elevator starts from 1st floor
    private  boolean direction; // false go up, true go down
    private  int[][] destination = new int[8][2]; 

    private int passengerInElevator; //total number of passenger in the elvator
/**
* Constructor
*/
    public Elevator(Building building){
>>>>>>> f67fd3ed308a3fbf7e57ce1a37533fb1a97aa1b7
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
<<<<<<< HEAD
       //if(building.getFloor(currentFloor).getPassengersWaiting() > 0){
            try{
                while(building.getFloor(currentFloor).passengersWaiting > 0 && passengerInElevator!=CAPACITY){
                    building.getFloor(currentFloor).passengersWaiting--;
                    boardPassenger(1);
                }
            }catch(ElevatorFullException e){
                System.out.println("Capacity reached: " + e);
            }
       //}
        passengerInElevator = passengerInElevator - numberDestined[currentFloor]; 
        numberDestined[currentFloor] = 0; // clears number of people destined for the current floor. 
        
=======
        destination[currentFloor][1] = 0; // clears number of people destined for the current floor. 
>>>>>>> f67fd3ed308a3fbf7e57ce1a37533fb1a97aa1b7
        System.out.println(toString());
    }
/**
* @param destinationFloor Passenger destination floor 
*/
<<<<<<< HEAD
    public void boardPassenger(int destinationFloor) throws ElevatorFullException{ 
        passengerInElevator++; 
        numberDestined[destinationFloor] ++;

        if(passengerInElevator >= CAPACITY){
            throw new ElevatorFullException("!!");
        }
=======
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
       
>>>>>>> f67fd3ed308a3fbf7e57ce1a37533fb1a97aa1b7
    }

    public String toString(){
        return "Floor " +currentFloor+ ": " + passengerInElevator + " Passengers";
    }


    public int getCurrentFloor(){
<<<<<<< HEAD
        return currentFloor;
=======
        return this.currentFloor;
>>>>>>> f67fd3ed308a3fbf7e57ce1a37533fb1a97aa1b7
    }

    public int getPassengers(){
        return passengerInElevator;
    }

    public void setDestination(int floor){
        numberDestined[floor] ++;
    }

    // public void stopElevator()throws ElevatorFullException{
    //     while(building.getFloor(currentFloor).getPassengersWaiting() > 0){
    //         try{
    //             boardPassenger(1);
    //         }catch (ElevatorFullException e) {
    //             throw new ElevatorFullException("!!");
    //         }
    //         building.getFloor(currentFloor).passengersWaiting--;
    //     }
    // }
}
