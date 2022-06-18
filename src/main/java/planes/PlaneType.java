package planes;

public enum PlaneType {
    
    BOEING747 (400,155000.00),
    BOEING777 (3, 85000.00),
    BOEING737 (200,40000.00);
    
    private final int capacity;
    private final double totalWeight;
    
    PlaneType(int capacity, double totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }
    
    public int getCapacity() {
        return this.capacity;
    }
    
    public double getTotalWeight() {
        return this.totalWeight;
    }
}

