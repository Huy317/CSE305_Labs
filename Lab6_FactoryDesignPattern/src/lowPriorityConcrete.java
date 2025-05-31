public class lowPriorityConcrete extends requestProduct {

    public lowPriorityConcrete() {
        super("Ignore", "Done","2025-05-31");
    }
    
    @Override
    public void setPriority(){
        super.priority = "Ignore";
    }
    @Override
    public void setStatus(){
        super.status = "Done";
    }
    @Override
    public void setExpireDay(){
        super.status = "2025-05-31";
    }

    @Override
    public void processRequest(){
        System.out.println("Request denied");
    }
}
