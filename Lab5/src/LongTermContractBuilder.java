public class LongTermContractBuilder implements ContractBuilder {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private int rentAmount;

    @Override
    public ContractBuilder buildContractID(String contractID) {
        this.contractID = "LONGTERM_"+contractID;
        return this;
    }

    @Override
    public ContractBuilder buildPropertyID(String propertyID) {
       this.propertyID = propertyID;
       return this;
    }

    @Override
    public ContractBuilder buildTenantID(String tenantID) {
        this.tenantID = tenantID;
        return this;
    }

    @Override
    public ContractBuilder buildRentAmount(int rentAmount) {
        this.rentAmount = rentAmount;
        return this;
    }

    @Override
    public Contract signContract() {
        return new Contract(contractID, propertyID, tenantID, rentAmount);
    }
    
}
