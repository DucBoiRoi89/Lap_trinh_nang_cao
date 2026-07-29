class PartTimeStaff extends Staff{
    int workingHours;
    double hourlyRate;
    public PartTimeStaff(String id, String name, int workingHours, double hourlyRate){
        super(id, name);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }
    @Override
    public double getPaymentAmount(){
        return workingHours * hourlyRate;
    }
}