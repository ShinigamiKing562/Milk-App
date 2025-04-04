package CollectorModule;

import java.util.Date;

public class NotificationService {
   public NotificationService() {
   }

   public void notifyFarmer(String farmId, String collectionPointId, long scheduledTime) {
      System.out.println("Notification sent to Farmer " + farmId + " for collection at " + collectionPointId + " at " + String.valueOf(new Date(scheduledTime)));
   }
}
