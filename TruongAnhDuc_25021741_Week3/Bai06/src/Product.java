abstract class Product{
    String type;
    String id;
    String name;
    double price;
    public Product(String type, String id, String name, double price){
        this.type = type;
        this.id = id;
        this.name = name;
        this.price = price;
    }
    abstract public double getFinalPrice();
}