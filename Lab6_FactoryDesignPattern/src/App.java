public class App {
    public static void main(String[] args) throws Exception {
        // requestProduct high = requestCreator.createRequest("high");
        // high.processRequest();
        // requestProduct mid = requestCreator.createRequest("mid");
        // mid.processRequest();
        // requestProduct low = requestCreator.createRequest("low");
        // low.processRequest();
        lowPriorCreator low = new lowPriorCreator();
        requestProduct lowRequest = low.createRequest();
        lowRequest.processRequest();

        midPriorCreator mid = new midPriorCreator();
        requestProduct midRequest = mid.createRequest();
        midRequest.processRequest();

        highPriorCreator high = new highPriorCreator();
        requestProduct highRequest = high.createRequest();
        highRequest.processRequest();
    }
}
