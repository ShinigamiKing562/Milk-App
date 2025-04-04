package CollectorModule;

import java.time.LocalDate;

public class MilkCollection {
    private LocalDate collectionDate;
    private String farmId; // Reference to external farm data
    private String farmName; // Reference to external farm data
    private double quantity; // in liters
    private double pricePerLiter;
    private String collectionPointId;
    
    // Minimal constructor (when you don't have farmName)
    public MilkCollection(LocalDate date, String farmId,
            double quantity, double price, String pointId) {
        this(date, farmId, null, quantity, price, pointId);
    }

    public MilkCollection(LocalDate collectionDate, String farmId, 
                          String farmName, double quantity, 
                          double pricePerLiter, String pointId) 
    {
        this.collectionDate = collectionDate;
        this.farmId = farmId;
        this.farmName = farmName;
        this.quantity = quantity;
        this.pricePerLiter = pricePerLiter;
        this.collectionPointId = pointId;
    }
    
   // Getters
    public String getFarmId() { return farmId; }
    public String getFarmName() { return farmName; }
    public double getQuantity() { return quantity; }
    public String getCollectionPointId() {
        return collectionPointId;
    }
    public double getTotalValue() {
        return quantity * pricePerLiter;
    }
    
    @Override
    public String toString() {
        String farmDisplay = farmName != null ? 
            farmName + " (" + farmId + ")" : farmId;
        return String.format(
            "MilkCollection[Date=%s, Farm=%s, Qty=%.2fL, Total=%.2f]",
            collectionDate, farmDisplay, quantity, getTotalValue()
        );
    }
}