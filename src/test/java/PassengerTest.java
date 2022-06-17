import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    
    Passenger passenger;
    
    @Before
    public void before() {
        passenger = new Passenger("Helen Morris", 2);
    }
    
    @Test
    public void hasName (){
        assertEquals("Helen Morris", passenger.getName());
    }
    
    @Test
    public void hasNumOfBags (){
        assertEquals(2, passenger.getNumOfBags());
    }
    
    @Test
    public void canChangeName (){
        passenger.setName("Helen Smith");
        assertEquals("Helen Smith", passenger.getName());
    }
    
    @Test
    public void canChangeNumOfBags (){
        passenger.setNumOfBags(3);
        assertEquals(3, passenger.getNumOfBags());
    }
}


