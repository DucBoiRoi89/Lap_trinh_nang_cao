class FullTimeEmployee extends Employee{
    double baseSalary;
    double bonus;
    double penalty;
    public FullTimeEmployee(String name, double baseSalary, double bonus, double penalty){
        super("F", name);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.penalty = penalty;
    }
    public double getSalary(){
        return baseSalary + (bonus - penalty);
    }
}