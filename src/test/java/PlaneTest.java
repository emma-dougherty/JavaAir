import org.junit.Before;
import org.junit.Test;
import planes.Plane;
import planes.PlaneType;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
        
        Plane plane;
        
        @Before
        public void before() {
                plane = new Plane(PlaneType.BOEING737);
        }
        
        @Test
        public void hasType (){
                assertEquals(PlaneType.BOEING737, plane.getType());
        }
        
        @Test
        public void canChangePlaneType (){
                plane.setPlaneType(PlaneType.BOEING747);
                assertEquals(PlaneType.BOEING747, plane.getType());
        }
        
        @Test
        public void hasCapacity (){
                assertEquals(200, plane.getType().getCapacity());
        }
        
        @Test
        public void hasTotalWeight (){
                assertEquals(40000.00, plane.getType().getTotalWeight(), 0.00);
        }
}

