public class App {
    public static void main(String[] args) throws Exception {
        ContractBuilder contractBuilder = new PermanentContractBuilder().buildContractID("1").buildRentAmount(999);
        System.out.println(contractBuilder.signContract().toString());
    }
}
