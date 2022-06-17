public class Pilot {
    
    private String name;
    private Rank rank;
    private String pilotLicenceNumber;
    
    public Pilot(String name, Rank rank, String pilotLicenceNumber) {
        this.name = name;
        this.rank = rank;
        this.pilotLicenceNumber = pilotLicenceNumber;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Rank getRank() {
        return rank;
    }
    
    public void setRank(Rank rank) {
        this.rank = rank;
    }
    
    public String getPilotLicenceNumber() {
        return pilotLicenceNumber;
    }
    
    public void setPilotLicenceNumber(String pilotLicenceNumber) {
        this.pilotLicenceNumber = pilotLicenceNumber;
    }
    
    public String flyPlane(){
        return "Come fly with me";
    }
}
