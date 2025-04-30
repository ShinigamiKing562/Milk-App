package CollectorModule;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;


public class Collector {
    public static void main(String[] args) {

        //  Initialize collection points
        CollectionPoint point1 = new CollectionPoint("CP001", "North Warehouse");
        CollectionPoint point2 = new CollectionPoint("CP002", "East Depot");

        // Create a milk collector profile
        MilkCollectorProfile collector = new MilkCollectorProfile(
            "MC001", 
            "John Doe", 
            "+1234567890", 
            "North Region", 
            "ABC123", 
            500.0,  // Daily capacity: 500 liters
            5       // 5 years of experience
        );
        collector.assignCollectionPoint(point1.getPointId());
        collector.assignCollectionPoint(point2.getPointId());

        // Get farm data from external module (simulated)
        Map<String, String> externalFarms = Map.of(
            "F001", "Green Pastures",
            "F002", "Happy Cows"
        );
        
        // Assign farms 
        collector.assignFarm("F001");
        collector.assignFarm("F002");
        
        // Record collections 
        List<MilkCollection> todaysCollections = List.of(
           new MilkCollection(LocalDate.now(), point1.getPointId(), 120.0, 0, null),
        new MilkCollection(LocalDate.now(), point2.getPointId(), 180.0, 0, null)
        );
        
        // Process collections
        double dailyTotal = todaysCollections.stream()
            .mapToDouble(MilkCollection::getQuantity)
            .sum();
        
        //  Display results
        System.out.println("=== Collector ===");
        System.out.println(collector);
        System.out.println("Assigned Farms: " + collector.getAssignedFarmIds());
        
        System.out.println("\n=== Today's Collections ===");
        todaysCollections.forEach(System.out::println);
        
        System.out.println("\n=== Active Collection Points ===");
        System.out.println(point1);
        System.out.println(point2);

        System.out.printf("\nDaily Total: %.2f liters (Capacity: %s)%n",
            dailyTotal,
            collector.isCapacityReached(dailyTotal) ? "FULL" : "OK");
    }
}
