package CollectorModule;
public class Farm {
    private String farmId;
    private String farmName;
    private String location;
    private double averageDailyProduction; // in liters
    
    public Farm(String farmId, String farmName, String location, double averageDailyProduction) {
        this.farmId = farmId;
        this.farmName = farmName;
        this.location = location;
        this.averageDailyProduction = averageDailyProduction;
    }
    
    // Getters
    public String getFarmId() {
        return farmId;
    }

    public String getFarmName() {
        return farmName;
    }

    public String getLocation() {
        return location;
    }

    public double getAverageDailyProduction() {
        return averageDailyProduction;
    }

    // Setters
    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAverageDailyProduction(double averageDailyProduction) {
        this.averageDailyProduction = averageDailyProduction;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "farmId='" + farmId + '\'' +
                ", farmName='" + farmName + '\'' +
                ", location='" + location + '\'' +
                ", averageDailyProduction=" + averageDailyProduction +
                '}';
    }
}
