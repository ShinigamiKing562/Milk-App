package CollectorModule;

import java.util.ArrayList;
import java.util.List;

public class MilkCollectorProfile {
    // Basic profile information
    private String collectorId;
    private String name;
    private String contactNumber;
    private String region;
    private String vehicleNumber;
    
    // Collection details
    private List<Farm> assignedFarms;
    private double dailyCollectionCapacity; // in liters
    private double currentDayCollection;
    private int yearsOfExperience;
    
    // Constructor
    public MilkCollectorProfile(String collectorId, String name, String contactNumber, String region, String vehicleNumber, double dailyCollectionCapacity, int yearsOfExperience) 
    {
        this.collectorId = collectorId;
        this.name = name;
        this.contactNumber = contactNumber;
        this.region = region;
        this.vehicleNumber = vehicleNumber;
        this.dailyCollectionCapacity = dailyCollectionCapacity;
        this.yearsOfExperience = yearsOfExperience;
        this.assignedFarms = new ArrayList<>();
        this.currentDayCollection = 0.0;
    }
    
    // Getters and Setters
    public String getCollectorId() {
        return collectorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public List<Farm> getAssignedFarms() {
        return assignedFarms;
    }

    public double getDailyCollectionCapacity() {
        return dailyCollectionCapacity;
    }

    public void setDailyCollectionCapacity(double dailyCollectionCapacity) {
        this.dailyCollectionCapacity = dailyCollectionCapacity;
    }

    public double getCurrentDayCollection() {
        return currentDayCollection;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    
    // Business methods
    public void addFarm(Farm farm) {
        this.assignedFarms.add(farm);
    }
    
    public void removeFarm(Farm farm) {
        this.assignedFarms.remove(farm);
    }
    
    public void recordCollection(double quantity) {
        if (currentDayCollection + quantity > dailyCollectionCapacity) {
            System.out.println("Warning: Exceeding daily collection capacity!");
        }
        this.currentDayCollection += quantity;
    }
    
    public void resetDailyCollection() {
        this.currentDayCollection = 0.0;
    }
    
    public boolean isCapacityReached() {
        return currentDayCollection >= dailyCollectionCapacity;
    }
    
    @Override
    public String toString() {
        return "MilkCollectorProfile{" +
                "collectorId='" + collectorId + '\'' +
                ", name='" + name + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", region='" + region + '\'' +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", dailyCollectionCapacity=" + dailyCollectionCapacity +
                ", currentDayCollection=" + currentDayCollection +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }
}

// Supporting Farm class
class Farm {
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
    
    // Getters and setters
    public String getFarmId() {
        return farmId;
    }

    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getAverageDailyProduction() {
        return averageDailyProduction;
    }

    public void setAverageDailyProduction(double averageDailyProduction) {
        this.averageDailyProduction = averageDailyProduction;
    }
}