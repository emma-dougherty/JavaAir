import flightCrew.CabinCrewMember;
import flightCrew.Pilot;
import flightCrew.Rank;
import planes.Plane;
import planes.PlaneType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    
    FlightManager flightManager;
    Flight flight;
    Pilot pilot;
    Plane plane;
    ArrayList<CabinCrewMember> crew;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    
    ArrayList<Passenger> passengers;
    
    @Before
    
    public void before(){
        plane = new Plane(PlaneType.BOEING737);
        pilot = new Pilot("Kresten Smith", Rank.FIRSTOFFICER, "5674");
        cabinCrewMember1 = new CabinCrewMember("Jenny Wren", Rank.FLIGHTATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Peter Peebles", Rank.FLIGHTATTENDANT);
        ArrayList<CabinCrewMember> crew = new ArrayList<>();
        flight = new Flight(pilot, crew, plane, "BA234", Airport.AMS, Airport.EDI, "10.00");
        flightManager = new FlightManager("Julia", flight);
        passenger1 = new Passenger("Jane", 1);
        passenger2 = new Passenger("Jim", 2);
        passenger3 = new Passenger("Jodie", 2);
        passenger4 = new Passenger("Jay", 1);
        flight.addCrewMember(cabinCrewMember1);
        flight.addCrewMember(cabinCrewMember2);
    }
    
    @Test
    public void canCalculateBaggageAllowancePerPassenger(){
        assertEquals(100, flightManager.baggageAllowancePerPassenger(),0.00);
    }
    
    @Test
    public void canCalculateBaggageWeightBookedByPassengers(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        assertEquals(600, flightManager.bookedBaggageWeight(),0.00);
    }
    
    @Test
    public void canCalculateRemainingBaggageWeight(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        assertEquals(19400, flightManager.remainingBaggageWeight(),0.00);
    }
}
