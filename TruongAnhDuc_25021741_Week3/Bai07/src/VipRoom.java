class VipRoom extends Room{
    public VipRoom(int numberOfNights){
        super("V", 2000000, numberOfNights);
    }
    public int getFinalPrice(){
        return price * numberOfNights;
    }

}