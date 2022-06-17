import flightCrew.CabinCrewMember;
import flightCrew.Pilot;
import flightCrew.Rank;
import org.junit.Before;
import org.junit.Test;
import planes.Plane;
import planes.PlaneType;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    
    Flight flight;
    Pilot pilot;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Plane plane;
    
    @Before
    public void before() {
        passenger1 = new Passenger("Jane", 1);
        passenger2 = new Passenger("Jim", 2);
        passenger3 = new Passenger("John", 2);
        flight.addCrewMember(cabinCrewMember1);
        flight.addCrewMember(cabinCrewMember2);
        cabinCrewMember1 = new CabinCrewMember("Jenny Wren", Rank.FLIGHTATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Peter Peebles", Rank.FLIGHTATTENDANT);
        pilot = new Pilot("Kresten Smith", Rank.FIRSTOFFICER, "5674");
        plane = new Plane(PlaneType.BOEING737);
        flight = new Flight(pilot, plane, "BA234", Airport.AMS, Airport.EDI, "10.00");
    }
    
//    @Test
//    public int CanGetAvailableSeats(){
//        assertEquals(2, );
//    }
    
    
}
