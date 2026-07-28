abstract class Robot{
    private int id;
    private String modelName;
    private int batteryLevel;
    public Robot(int id, String modelName){
        this.id = id;
        this.modelName = modelName;
    }
    public void chargeBattery(){
        batteryLevel = 100;
    }
    public final void showldentity(){
        System.out.println(id + " - " + modelName);
    }
    abstract public void performMainTask();
    public String getModelName(){
        String newModelName = new String(modelName);
        return newModelName;
    }
}