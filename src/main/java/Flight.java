import java.util.ArrayList;

import flightCrew.CabinCrewMember;
import flightCrew.Pilot;
import planes.Plane;
import planes.PlaneType;


public class Flight {
    
    private Pilot pilot;
    private ArrayList<CabinCrewMember> crew;
    private Passenger passenger;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private Airport destination;
    private Airport departure;
    private String departureTime;
    
    public Flight(Pilot pilot, Plane plane, String flightNumber, Airport destination, Airport departure, String departureTime) {
        this.pilot = pilot;
        this.crew = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
    }
    
    public void addCrewMember(CabinCrewMember cabinCrewMember) {
        this.crew.add(cabinCrewMember);
    }
    
    public int getAvailableSeats() {
        return this.plane.getCapacity();
    }
    
    public PlaneType getPlaneType(){
        return this.plane.getPlaneType();
    }
    
    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }
    
    public int getPassengers(){
        return this.passengers.size();
    }
}
