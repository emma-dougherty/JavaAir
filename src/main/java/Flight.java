import java.util.ArrayList;

import flightCrew.CabinCrewMember;
import flightCrew.Pilot;
import planes.Plane;


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
        this.crew = new ArrayList<CabinCrewMember>();
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
    
    
}
