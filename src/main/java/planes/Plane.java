package planes;

public class Plane {
    
    private PlaneType planeType;
    
    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }
    
    public PlaneType getType() {
        return this.planeType;
    }
    
    public void setPlaneType(PlaneType planeType) {
        this.planeType = planeType;
    }

}
