import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
        
        Plane plane;
        
        @Before
        public void before() {
            plane = new Plane(PlaneType.BOEING737);
        }
        
        @Test
        public void hasType (){
            assertEquals(PlaneType.BOEING737, plane.getPlaneType());
        }
        
        @Test
        public void canChangePlaneType (){
            plane.setPlaneType(PlaneType.BOEING747);
            assertEquals(PlaneType.BOEING747, plane.getPlaneType());
        }
    
        @Test
        public void hasCapacity (){
        assertEquals(200, plane.getCapacity());
        }
    
        @Test
        public void hasTotalWeight (){
        assertEquals(45000.00, plane.getTotalWeight(), 0.00);
        }
}

