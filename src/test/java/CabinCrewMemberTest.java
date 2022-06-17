import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    
    CabinCrewMember cabinCrewMember;
    
    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Jimmy Mac", Rank.FLIGHTATTENDANT);
    }
    
    @Test
    public void hasName (){
        assertEquals("Jimmy Mac", cabinCrewMember.getName());
    }
    
    @Test
    public void canChangeName (){
        cabinCrewMember.setName("Jimmy Smith");
        assertEquals("Jimmy Smith", cabinCrewMember.getName());
    }
    
    @Test
    public void hasRank (){
        assertEquals(Rank.FLIGHTATTENDANT, cabinCrewMember.getRank());
    }
    
    @Test
    public void canChangeRank (){
        cabinCrewMember.setRank(Rank.CAPTAIN);
        assertEquals(Rank.CAPTAIN, cabinCrewMember.getRank());
    }
    
    @Test
    public void canMakeAnnouncement (){
        assertEquals("Exits are here and here", cabinCrewMember.makeAnnouncement());
    }
}


