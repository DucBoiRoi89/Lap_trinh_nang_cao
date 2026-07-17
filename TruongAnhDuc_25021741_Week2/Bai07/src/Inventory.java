class Inventory{
    Product[] items;
    public Inventory(Product[] initialltems){
        this.items = initialltems;
    }
    public Product[] getItems(){
        return this.items;
    }
}