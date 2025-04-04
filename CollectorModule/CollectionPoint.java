package CollectorModule;

public class CollectionPoint {
    
   private String pointId;
   private String location;
   private boolean isActive;

   public CollectionPoint(String pointId, String location) {
      this.pointId = pointId;
      this.location = location;
      this.isActive = true;
   }

   public String getPointId() {
      return this.pointId;
   }

   public String getLocation() {
      return this.location;
   }

   public boolean isActive() {
      return this.isActive;
   }

   public void setActive(boolean active) {
      this.isActive = active;
   }
}
