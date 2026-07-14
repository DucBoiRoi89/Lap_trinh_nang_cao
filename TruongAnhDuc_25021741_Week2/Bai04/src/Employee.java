class Employee{
    String name;
    MyDate birthday;
    public Employee(String name, MyDate birthday){
        this.name = name;
        this.birthday = birthday;
    }
    public Employee(Employee other){
        this.name = other.name;
        this.birthday = other.birthday;
    }
    public void setBirthday(MyDate birthday){
        this.birthday = birthday;
    }
}