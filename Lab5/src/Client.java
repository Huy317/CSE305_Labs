public class Client {
    public Contract requestCreateRentalContract(){
        ContractBuilder contractBuilder = new PermanentContractBuilder().buildContractID("1").buildRentAmount(999);
        return contractBuilder.signContract();
    }
}
