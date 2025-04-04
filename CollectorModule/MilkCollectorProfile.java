package CollectorModule;

import java.util.ArrayList;
import java.util.List;

public class MilkCollectorProfile {
    private String collectorId;
    private String name;
    private String contactNumber;
    private String region;
    private String vehicleNumber;
    private List<String> assignedFarmIds;
    private double dailyCollectionCapacity;
    private List<String> assignedCollectionPointIds;
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
        this.assignedCollectionPointIds = new ArrayList<>();
        this.yearsOfExperience = yearsOfExperience;
        this.assignedFarmIds = new ArrayList<>();
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

     public List<String> getAssignedFarmIds() { return assignedFarmIds; }
    

    public double getDailyCollectionCapacity() {
        return dailyCollectionCapacity;
    }

    public void setDailyCollectionCapacity(double dailyCollectionCapacity) {
        this.dailyCollectionCapacity = dailyCollectionCapacity;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    
     // Business methods
    public void assignFarm(String farmId) {
        if (!assignedFarmIds.contains(farmId)) {
            assignedFarmIds.add(farmId);
        }
    }
    
    public boolean isAssignedToFarm(String farmId) {
        return assignedFarmIds.contains(farmId);
    }

    public void assignCollectionPoint(String pointId) {
        if (!assignedCollectionPointIds.contains(pointId)) {
            assignedCollectionPointIds.add(pointId);
        }
    }

    public boolean servesCollectionPoint(String pointId) {
        return assignedCollectionPointIds.contains(pointId);
    }
    
    public boolean isCapacityReached(double currentCollection) {
        return currentCollection >= dailyCollectionCapacity;
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
                ", collectionPoints=" + assignedCollectionPointIds.size() +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }
}