import java.util.ArrayList;

public class Tenant extends User {
    public Tenant(String userId, String password, String email, String userType) {
        super(userId, password, email, userType);
        // TODO Auto-generated constructor stub
    }

    private ArrayList<RentalContract> listOfContract = new ArrayList<>();

    public void requestCreateRentalContract() {

    }

    public void requestTerminateRentalContract() {

    }

}