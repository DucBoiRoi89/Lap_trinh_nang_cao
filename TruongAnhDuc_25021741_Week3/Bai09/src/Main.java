import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        IPayable[] payableList = new IPayable[n];
        double totalPay = 0.0;
        for (int i = 0; i < n; i++){
            String lines = scanner.nextLine();
            String[] listLines = lines.split(" ");
            String type = listLines[0];
            if (type.equals("S")){
                String id = listLines[1];
                String name = listLines[2];
                int workingHours = Integer.parseInt(listLines[3]);
                double hourlyRate = Double.parseDouble(listLines[4]);
                payableList[i] = new PartTimeStaff(id, name, workingHours, hourlyRate);
            } else if (type.equals("I")){
                String itemName = listLines[1];
                int quantity = Integer.parseInt(listLines[2]);
                double pricePerItem = Double.parseDouble(listLines[3]);
                payableList[i] = new Invoice(itemName, quantity, pricePerItem);
            }
        }
        for (int i = 0; i < n; i++){
            totalPay += payableList[i].getPaymentAmount();
            if (payableList[i] instanceof PartTimeStaff){
                System.out.println("PartTimeStaff" + " " + ((PartTimeStaff) payableList[i]).getName() + " - " + "Payment" + ": " + payableList[i].getPaymentAmount());
            } else if (payableList[i] instanceof Invoice){
                System.out.println("Invoice" + " " + ((Invoice) payableList[i]).itemName + " - " + "Payment" + ": " + payableList[i].getPaymentAmount());
            }
        }
        System.out.println("Total" + " " + "Payment" + " = " + totalPay);
    }
}