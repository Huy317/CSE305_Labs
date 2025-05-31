public class midPriorityConcrete extends requestProduct {

    public midPriorityConcrete() {
        super("Medium", "Accepted   ","2025-06-31");
    }
    
    @Override
    public void setPriority(){
        super.priority = "Medium";
    }
    @Override
    public void setStatus(){
        super.status = "Accepted";
    }
    @Override
    public void setExpireDay(){
        super.status = "2025-06-31";
    }

    @Override
    public void processRequest(){
        System.out.println("Request accept, estimated completion date is "+super.expireDay);
    }
}
