public class Plane {
    
    private PlaneType type;
    
    public Plane(PlaneType planeType) {
        this.type = planeType;
    }
    
    public PlaneType getPlaneType() {
        return type;
    }
    
    public void setPlaneType(PlaneType planeType) {
        this.type = planeType;
    }
    
    public int getCapacity() {
        return  this.type.getCapacity();
    }
    
    public double getTotalWeight() {
        return  this.type.getTotalWeight();
    }
}
