package Controller;

public class AllServices {

    public static final String ip = "localhost";
    public static final Service createUser = new Service("/createAccount", "4567", "POST");
    public static final Service logIn = new Service("/logIn", "4567", "POST");

    public AllServices() {
    }
}
