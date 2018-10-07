package cscie55.hw2;

/**
 *  Create fields for the class. 
 *  FLOORS: number of floors in the building, and set it to 7.
 *  elevator: an elevator object.
 *  floors: number of floors in the building;
 *  
 */
public class Building{

    public static final int FLOORS = 7;
    //private int currentFloor;
    private Elevator elevator; 
    private Floor[] floors = new Floor[8]; 
    
    public Building(){
        this.elevator = new Elevator(this);
        for(int i = 1; i <=7 ; i++){
            floors[i] = new Floor(this,i);
        }
    }

    public Elevator getElevator(){
        return elevator;
    }

    public Floor getFloor(int floorNumber){
        return floors[floorNumber];
    }

    
}