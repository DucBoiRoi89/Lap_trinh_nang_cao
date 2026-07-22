import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        String name1 = scanner.next();
        double price1 = scanner.nextDouble();
        int quantity1 = scanner.nextInt();
        double discount1 = scanner.nextDouble();
        String name2 = scanner.next();
        double price2 = scanner.nextDouble();
        int quantity2 = scanner.nextInt();
        double discount2 = scanner.nextDouble();
        Product p1 = new Product(name1, price1, quantity1, discount1);
        Product p2 = new Product(name2, price2, quantity2, discount2);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        p1.sell(a1);
        p2.sell(a2);
        System.out.println(name1);
        System.out.println(p1.calculateFinalPrice());
        System.out.println(p2.calculateFinalPrice());
        Product.updateTaxRate(0.08);
        System.out.println(p1.calculateFinalPrice());
        System.out.println(p2.calculateFinalPrice());
        p1.updateDiscount(10.0);
        System.out.println(p1.calculateFinalPrice());
        System.out.println(p2.calculateFinalPrice());
        System.out.println(Product.getTotalRevenue());
    }
}