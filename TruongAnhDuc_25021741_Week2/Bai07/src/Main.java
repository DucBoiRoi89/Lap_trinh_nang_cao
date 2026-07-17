class Main{
    public static void main(String[] args){
        Product product1 = new Product("001", "Product 1", "20.0");
        Product product2 = new Product("002", "Product 2 ", "30.0");
        Product[] arr = new Product[]{product1, product2};
        Inventory inventory = new Inventory(arr);
        SetPriceProduct1.setPriceProduct(arr);
        System.out.println("Danh sach san pham trong doi tuong kho:");
        for (Product product : inventory.items) {
            System.out.println(product.id + " " + product.name + " " + product.price);
        }
    }
}