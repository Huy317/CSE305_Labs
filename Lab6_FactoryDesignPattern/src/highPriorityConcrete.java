public class highPriorityConcrete extends requestProduct {

    public highPriorityConcrete() {
        super("Emergency", "Accept   ","2025-05-31");
    }
    
    @Override
    public void setPriority(){
        super.priority = "Emergency";
    }
    @Override
    public void setStatus(){
        super.status = "Accept";
    }
    @Override
    public void setExpireDay(){
        super.status = "2025-05-31";
    }

    @Override
    public void processRequest(){
        System.out.println("Emergency request, our Administer will contact you immediately!");
    }
}
