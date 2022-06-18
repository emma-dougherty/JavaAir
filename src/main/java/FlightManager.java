public class FlightManager {
    
    private String name;
    private Flight flight;
    
    public FlightManager(String name, Flight flight) {
        this.name = name;
        this.flight = flight;
    }
    
    public double totalBaggageAllowance(){
        return this.flight.getPlaneWeight() / 2;
    }
    
    public double baggageAllowancePerPassenger() {
            return totalBaggageAllowance() / this.flight.getPlaneCapacity() ;
    }
    
    public double bookedBaggageWeight() {
        return this.baggageAllowancePerPassenger() * this.flight.getNumOfBagsBooked(flight);
    }
    
    public double remainingBaggageWeight() {
        return totalBaggageAllowance() - this.bookedBaggageWeight();
    }
}
