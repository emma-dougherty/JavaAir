import org.junit.Before;
import org.junit.Test;
import flightCrew.CabinCrewMember;
import flightCrew.Pilot;
import flightCrew.Rank;
import planes.Plane;
import planes.PlaneType;

import java.util.ArrayList;
import java.time.LocalTime;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    
    Flight flight;
    Pilot pilot;
    ArrayList<CabinCrewMember> crew;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Plane plane;
    
    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING777);
        pilot = new Pilot("Kresten Smith", Rank.FIRSTOFFICER, "5674");
        cabinCrewMember1 = new CabinCrewMember("Jenny Wren", Rank.FLIGHTATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Peter Peebles", Rank.FLIGHTATTENDANT);
        ArrayList<CabinCrewMember> crew = new ArrayList<>();
        flight = new Flight(pilot, crew, plane, "BA234", Airport.AMS, Airport.EDI,"10:00");
        passenger1 = new Passenger("Jane", 1);
        passenger2 = new Passenger("Jim", 2);
        passenger3 = new Passenger("Jodie", 2);
        passenger4 = new Passenger("Jay", 1);
        
        flight.addCrewMember(cabinCrewMember1);
        flight.addCrewMember(cabinCrewMember2);
    }
    
    @Test
    public void hasPilot () {
        assertEquals("Kresten Smith", flight.getPilot().getName());
    }
    
    @Test
    public void hasCabinCrew(){
        assertEquals(2, flight.getNumberOfCabinCrewMembers());
    }
    
    @Test
    public void canGetPlaneCapacity() {
        assertEquals(3, flight.getPlaneCapacity());
    }
    
    @Test
    public void canGetPlaneWeight() {
        assertEquals(85000.00, flight.getPlaneWeight(), 0.00);
    }
    
    @Test
    public void canGetPlaneModel() {
        assertEquals(PlaneType.BOEING777, flight.getPlaneType());
    }
    
    @Test
    public void hasFlightNumber() {
        assertEquals("BA234", flight.getFlightNumber());
    }
    
    @Test
    public void hasDestination () {
        assertEquals(Airport.AMS, flight.getDestination());
    }
    
    @Test
    public void hasDeparture () {
        assertEquals(Airport.EDI, flight.getDeparture());
    }
    
    @Test
    public void startsWithEmptyListOfPassengers(){
        assertEquals(0, flight.getNumberOfPassengers());
    }
    
    @Test
    public void canGetAvailableSeats(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        assertEquals(0, flight.getAvailableSeats());
    }
    
    @Test
    public void canGetNumberOfPassengerBagsBooked(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        assertEquals(5, flight.getNumOfBagsBooked(flight));
    }
    
    
    @Test
    public void canBookPassengerIfSeatsAvailable(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        assertEquals(3, flight.getNumberOfPassengers());
    }
    
    @Test
    public void cannotBookPassengerIfNoSeatsAvailable(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        assertEquals(3, flight.getNumberOfPassengers());
    }
}
