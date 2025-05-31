public class requestCreator {

    public static requestProduct createRequest(String type) {
        switch (type) {
            case "high":
                return new highPriorityConcrete();
            case "mid":
                return new midPriorityConcrete();

            case "low":
                return new lowPriorityConcrete();
            default:
                return null;

        }
    }
    public static requestProduct createLowPrior(){
        return new lowPriorityConcrete();
    }
    public static requestProduct createMidPrior(){
        return new midPriorityConcrete();
    }
    public static requestProduct createHighPrior(){
        return new highPriorityConcrete();
    }
}
