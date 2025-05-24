public class App {
    public static void main(String[] args) throws Exception {
        ContractBuilder contractBuilder = new PermanentContractBuilder().buildContractID("1").buildPropertyID("p-1").buildTenantID("t-1").buildRentAmount(999);
        Contract contract = contractBuilder.signContract();
        System.out.println(contract.toString());

        String encryptd = AES.encrypt(contract.toString(), "password");
        System.out.println(encryptd);
        String decrypted = AES.decrypt(encryptd, "password");
        System.out.println(decrypted);
    }
}
