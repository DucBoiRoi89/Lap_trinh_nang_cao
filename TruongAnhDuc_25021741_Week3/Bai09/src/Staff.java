abstract class Staff implements IPayable{
    String id, name;
    public Staff(String id, String name){
        this.id = id;
        this.name = name;
    }
    public String getId(){
        return id;
    }
    public void setId(String afterId){
        id = afterId;
    }
    public String getName(){
        return name;
    }
    public void setName(String afterName){
        name = afterName;
    }
}