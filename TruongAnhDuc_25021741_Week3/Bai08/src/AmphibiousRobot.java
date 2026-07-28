class AmphibiousRobot extends Robot implements Flyable, Swimmable, GPS{
    public AmphibiousRobot(int id, String modelName){
        super(id, modelName);
    }
    public void performMainTask(){
        System.out.println(super.getModelName() + " " + "performing main task");
        System.out.println(super.getModelName() + " " + "flying");
        System.out.println(super.getModelName() + " " + "swimming");
        System.out.println(super.getModelName() + " " + "getting coordinates");
    }
    public void fly(){
        System.out.println(super.getModelName() + " " + "can flying");
    }
    public void swim(){
        System.out.println(super.getModelName() + " " + "can swimming");
    }
    public void getCoordinates(){   
        System.out.println(super.getModelName() + " " + "can getting coordinates");
    }
}