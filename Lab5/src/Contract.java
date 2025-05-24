public class Contract {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private int rentAmount;

    public Contract(String contractID, String propertyID, String tenantID, int rentAmount) {
        this.contractID = contractID;
        this.propertyID = propertyID;
        this.tenantID = tenantID;
        this.rentAmount = rentAmount;
    }
    @Override
    public String toString(){
        return contractID+" "+propertyID+" "+tenantID+" "+rentAmount;
    }
}
