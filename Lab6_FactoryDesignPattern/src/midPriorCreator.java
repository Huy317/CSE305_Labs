public class midPriorCreator implements requestCreator {

    @Override
    public requestProduct createRequest() {
        return new midPriorityConcrete();
    }
    
}
