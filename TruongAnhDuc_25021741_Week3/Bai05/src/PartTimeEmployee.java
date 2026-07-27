class PartTimeEmployee extends Employee{
    double workingHours;
    double hourlyRate;
    public PartTimeEmployee(String name, double workingHours, double hourlyRate){
        super("P", name);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }
    public double getSalary(){
        return workingHours * hourlyRate;
    }
}