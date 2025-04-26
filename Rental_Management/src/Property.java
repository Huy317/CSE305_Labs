public class Property {
    private String propertyId;
    private String description;
    private String ownerId;

    public Property(String propertyId, String description, String ownerId) {
        this.propertyId = propertyId;
        this.description = description;
        this.ownerId = ownerId;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public String getDescription() {
        return description;
    }

    public String getOwnerId() {
        return ownerId;
    }
    
    
    
}