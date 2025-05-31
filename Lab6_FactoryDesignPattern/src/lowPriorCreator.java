public class lowPriorCreator implements requestCreator {

    @Override
    public requestProduct createRequest() {
        return new lowPriorityConcrete();
    }
    
}
