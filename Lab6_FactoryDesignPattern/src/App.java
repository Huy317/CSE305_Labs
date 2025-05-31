public class App {
    public static void main(String[] args) throws Exception {
        requestProduct high = requestCreator.createRequest("high");
        high.processRequest();
        requestProduct mid = requestCreator.createRequest("mid");
        mid.processRequest();
        requestProduct low = requestCreator.createRequest("low");
        low.processRequest();
    }
}
