import java.util.ArrayList;

import flightCrew.CabinCrewMember;
import flightCrew.Pilot;
import planes.Plane;
import planes.PlaneType;

public class Flight {
    
    private Pilot pilot;
    private ArrayList<CabinCrewMember> crew;
    private Plane plane;
    private String flightNumber;
    private Airport destination;
    private Airport departure;
    private String departureTime;
//    private Passenger passenger;
    private ArrayList<Passenger> passengers;
    
    public Flight(Pilot pilot, ArrayList<CabinCrewMember> crew, Plane plane, String flightNumber, Airport destination, Airport departure, String departureTime) {
        this.pilot = pilot;
        this.crew = crew;
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
    }
    
    public PlaneType getPlaneType() {
        return this.plane.getType();
    }
    
    public void addCrewMember(CabinCrewMember cabinCrewMember) {
        this.crew.add(cabinCrewMember);
    }
    
    public ArrayList<Passenger> getPassengers() {
        return this.passengers;
    }
    
    public Pilot getPilot() {
        return this.pilot;
    }
    
    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }
    
    public ArrayList<CabinCrewMember> getCrew() {
        return this.crew;
    }
    
    public void setPlane(Plane plane) {
        this.plane = plane;
    }
    
    public String getFlightNumber() {
        return this.flightNumber;
    }
    
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
    
    public Airport getDestination() {
        return this.destination;
    }
    
    public void setDestination(Airport destination) {
        this.destination = destination;
    }
    
    public Airport getDeparture() {
        return this.departure;
    }
    
    public void setDeparture(Airport departure) {
        this.departure = departure;
    }
    
    public String getDepartureTime() {
        return this.departureTime;
    }
    
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
    
    public int getPlaneCapacity() {
        return this.getPlaneType().getCapacity();
    }
    
    public int getNumberOfCabinCrewMembers() {
        return this.crew.size();
    }
    
    public double getPlaneWeight() {
        return this.getPlaneType().getTotalWeight();
    }
    
    public int getNumberOfPassengers() {
        return this.passengers.size();
    }
    
    private boolean isFull() {
        return this.passengers.size() == this.getPlaneType().getCapacity();
    }
    
    public int getAvailableSeats() {
        if (!isFull()) {
            int planeCapacity = this.getPlaneType().getCapacity();
            int numPassengers = this.passengers.size();
            return planeCapacity - numPassengers;
        } else
            return 0;
    }
    
    public void addPassenger(Passenger passenger) {
        if (!isFull()) {
            this.passengers.add(passenger);
        }
    }
    
    public int getNumOfBagsBooked(Flight flight) {
        int totalWeight = 0;
        ArrayList<Passenger> passengers = flight.getPassengers();
        for (Passenger passenger : passengers ){
            totalWeight += passenger.getNumOfBags();
        }
        return totalWeight;
    }
}
