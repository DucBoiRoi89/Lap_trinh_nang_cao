abstract class Room{
    String type;
    int price;
    int numberOfNights;
    public Room(String type, int price, int numberOfNights){
        this.type = type;
        this.price = price;
        this.numberOfNights = numberOfNights;
    }
    abstract public int getFinalPrice();
}