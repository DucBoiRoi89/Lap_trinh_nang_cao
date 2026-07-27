abstract class Employee{
    String type;
    String name;
    String day;
    String month;
    String year;
    String id;
    public Employee(String type, String name){
        this.name = name;
    }
    abstract public double getSalary();
}