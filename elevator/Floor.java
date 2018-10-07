package cscie55.hw2;


/**
 *  Create fields for the class. 
 *  floorNumber: number of floors in the building, and set it to 7.
 *  passengerWaiting: a field for tracking the number of passenger waiting on the floor.
 *  building: initiate a building object
 *  
 */
public class Floor{
    private int floorNumber;
    public int passengersWaiting;
    private Building building; 
    
    public Floor(Building building, int floorNumber){
        this.floorNumber = floorNumber; 
        this.building = building;
    };

    public int getPassengersWaiting(){
        return passengersWaiting;
    }


    public void waitForElevator(){
        passengersWaiting++; 
    }


}
