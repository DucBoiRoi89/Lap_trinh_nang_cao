class Electronics extends Product{
    double warrantyFees;
    public Electronics(String id, String name, double price, double warrantyFees){
        super("E", id, name, price);
        this.warrantyFees = warrantyFees;
    }
    @Override
    public double getFinalPrice(){
        return (price * 1.1) + warrantyFees;
    }

}