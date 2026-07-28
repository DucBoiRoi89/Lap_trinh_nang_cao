class DroneRobot extends Robot implements Flyable, GPS, ElectronicDivece{
    public DroneRobot(int id, String modelName){
        super(id, modelName);
    }
    public void performMainTask(){
        System.out.println(super.getModelName() + " " + "performing main task");
        System.out.println(super.getModelName() + " " + "flying");
        System.out.println(super.getModelName() + " " + "getting coordinates");
    }
    public void fly(){
        System.out.println(super.getModelName() + " " + "can flying");
    }
    public void getCoordinates(){
        System.out.println(super.getModelName() + " " + "can getting coordinates");
    }
    public void turnOn(){
        System.out.println(super.getModelName() + " " + "can turn On");
    }
}