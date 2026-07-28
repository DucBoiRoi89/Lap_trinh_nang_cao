import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();
        int numberOfNights = scanner.nextInt();
        if (type.equals("S")){
            Room room = new StandardRoom(numberOfNights);
            System.out.println(room.getFinalPrice());
        } else if (type.equals("V")){
            Room room = new VipRoom(numberOfNights);
            System.out.println(room.getFinalPrice());
        }
    }
}