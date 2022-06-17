import flightCrew.Pilot;
import flightCrew.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    
    Pilot pilot;
    
    @Before
    public void before() {
        pilot = new Pilot("Kresten Lowe", Rank.CAPTAIN, "BA256");
    }
    
    @Test
    public void hasName (){
        assertEquals("Kresten Lowe", pilot.getName());
    }
    
    @Test
    public void canChangeName (){
        pilot.setName("Kresten Smith");
        assertEquals("Kresten Smith", pilot.getName());
    }
    
    @Test
    public void hasRank (){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }
    
    @Test
    public void canChangeRank (){
        pilot.setRank(Rank.FIRSTOFFICER);
        assertEquals(Rank.FIRSTOFFICER, pilot.getRank());
    }
    
    @Test
    public void canChangePilotNumber (){
        pilot.setPilotLicenceNumber("BA257");
        assertEquals("BA257", pilot.getPilotLicenceNumber());
    }
    
    @Test
    public void hasPilotNumber (){
        assertEquals("BA256", pilot.getPilotLicenceNumber());
    }
    
    @Test
    public void canFlyPlane (){
        assertEquals("Come fly with me", pilot.flyPlane());
    }
    
    
    
}


