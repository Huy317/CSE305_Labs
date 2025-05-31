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

}
