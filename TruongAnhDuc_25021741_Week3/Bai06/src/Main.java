import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        double total = 0.0;
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Product[] listProduct = new Product[n];
        for (int i = 0; i < n; i++){
            String lines = scanner.nextLine();
            String type = lines.substring(0, 1);
            String lastId = String.valueOf(i);
            if (type.equals("E")){
                String name = lines.substring(lines.indexOf("\"") + 1, lines.lastIndexOf("\""));
                String[] lastLines = lines.substring(lines.lastIndexOf("\"") + 2, lines.length()).split(" ");
                double price = Double.parseDouble(lastLines[0]);
                double warrantyFees = Double.parseDouble(lastLines[1]);
                listProduct[i] = new Electronics("0" + lastId, name, price, warrantyFees);
            } else if (type.equals("F")){
                String name = lines.substring(lines.indexOf("\"") + 1, lines.lastIndexOf("\""));
                String[] lastLines = lines.substring(lines.lastIndexOf("\"") + 2, lines.length()).split(" ");
                double price = Double.parseDouble(lastLines[0]);
                String[] theLastLines = lastLines[1].split("-");
                int year = Integer.parseInt(theLastLines[0]);
                int month = Integer.parseInt(theLastLines[1]);
                int day = Integer.parseInt(theLastLines[2]);
                listProduct[i] = new Food("0" + lastId, name, price, year, month, day);
            }
        }
        for (int i = 0; i < n; i++){
            if (listProduct[i] instanceof Electronics){
                total += listProduct[i].getFinalPrice();
                System.out.println(listProduct[i].name + " - " + "Electronics" + " - " + listProduct[i].getFinalPrice());
            } else if (listProduct[i] instanceof Food){
                total += listProduct[i].getFinalPrice();
                System.out.println(listProduct[i].name + " - " + "Food" + " - " + listProduct[i].getFinalPrice());
            }
        }
        System.out.println("Total = " + total);

    }
}