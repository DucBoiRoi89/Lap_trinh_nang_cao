class StandardRoom extends Room{
    public StandardRoom(int numberOfNights){
        super("S", 500000, numberOfNights);
    }
    public int getFinalPrice(){
        if (numberOfNights > 3){
            price = (int) Math.round(price * numberOfNights * 0.95);
            return price;
        } else if (numberOfNights > 0 && numberOfNights <= 3){
            return price * numberOfNights;
        } else{
            price = 0;
            return price;
        }
    }
    
}