public class App {
    public static void main(String[] args) throws Exception {
        requestProduct high = requestCreator.createHighPrior();
        high.processRequest();
        requestProduct mid = requestCreator.createMidPrior();
        mid.processRequest();
        requestProduct low = requestCreator.createLowPrior();
        low.processRequest();
    }
}
