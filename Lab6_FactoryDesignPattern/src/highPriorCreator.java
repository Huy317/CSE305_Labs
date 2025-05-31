public class highPriorCreator implements requestCreator {

    @Override
    public requestProduct createRequest() {
        return new highPriorityConcrete();
    }
    
}
