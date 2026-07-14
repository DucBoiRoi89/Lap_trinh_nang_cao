class Book{
    private String title;
    private String author;
    private double price;
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        if (price < 0.0){
            this.price = 0.0;
            System.out.println("Loi !. Gia sach khong hop le.");
        } else{
            this.price = price;
        }
    }
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Book == false){
            return false;
        } else{
            Book otherBook = (Book) obj;
            if (this.title == otherBook.title && this.author == otherBook.author && this.price == otherBook.price){
                return true;
            }
            return false;
        }
    }
}