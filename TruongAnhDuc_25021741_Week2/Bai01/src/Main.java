public class Main {
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount("12345", -1000.0,"Nguyen Van A");
        BankAccount bankAccount1 = new BankAccount("1234", 10000.0, "Nguyen Van B");
        System.out.println(bankAccount1.withdraw(20000.0));
        System.out.println(bankAccount1.withdraw(5000.0));
    }
}
