class FishRobot extends Robot implements Swimmable{
    public FishRobot(int id, String modelName){
        super(id, modelName);
    }
    public void performMainTask(){
        System.out.println(super.getModelName() + " " + "performing main task");
        System.out.println(super.getModelName() + " " + "swimming");
    }
    public void swim(){
        System.out.println(super.getModelName() + " " + "can swimming");
    }
}