import java.util.*;

public class User {
    private String userId;
    private String password;
    private String email;
    private String userType;

    public User(String userId, String password, String email, String userType) {
        this.userId = userId;
        this.password = password;
        this.email = email;
        this.userType = userType;
    }

    public void createUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Id: ");
        String id = sc.nextLine();
        System.out.println("Password: ");
        String pass = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Email: ");
        String type = sc.nextLine();
        this.userId = id;
        this.password = pass;
        this.email = email;
        this.userType = type;
        sc.close();
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getUserType() {
        return userType;
    }
}
