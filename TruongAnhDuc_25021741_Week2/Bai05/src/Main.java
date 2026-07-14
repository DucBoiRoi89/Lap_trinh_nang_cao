class Main{
    public static void main(String[] args){
        Book book1 = new Book("book", "author", 100.0);
        Book book2 = new Book("book", "author", 100.0);
        System.out.println(book1 == book2);
        System.out.println(book1.equals(book2));
    }
    // toan tu "==" so sanh dia chi, con phuong thuc equals() so sanh gia tri neu khong override thi hoat dong y het toan tu "==".
}