public class App {
    public static void main(String[] args) throws Exception {
        ContractBuilder contractBuilder = new PermanentContractBuilder().buildContractID("1").buildRentAmount(999);
        System.out.println(contractBuilder.signContract().toString());

        String encryptd = AES.encrypt("HelloWorld123", "password");
        System.out.println(encryptd);
        String decrypted = AES.decrypt(encryptd, "password");
        System.out.println(decrypted);
    }
}
