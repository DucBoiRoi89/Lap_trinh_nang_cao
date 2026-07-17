final class SetPriceProduct1{
    private SetPriceProduct1(){
        throw new UnsupportedOperationException("Day la lop tin ich, khong the khoi tao doi tuong");
    }
    public static void setPriceProduct(Product[] product){
        product[0].setPrice("5000");
    }
}