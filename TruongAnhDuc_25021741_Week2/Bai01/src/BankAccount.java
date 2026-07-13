class BankAccount{
    private String accountNumber;
    private double balance = 0.0;
    String ownerName;
    public BankAccount(String accountNumber, double balance, String ownerName){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        if (balance < 0) {
            this.balance = 0.0;
            System.out.println("Loi !. So du khong duoc am.");
        } else{
            this.balance = balance;
        }
    }
    public void deposit(double amount){
        if (amount < 0){
            System.out.println("Loi !. So tien gui khong duoc am.");
        } else{
            this.balance += amount;
        }
    }
    public boolean withdraw(double amount){
        if (amount > 0 && amount <= this.balance){
            this.balance -= amount;
            return true;
        }
        return false;
    }
    public double getBalance(){
        return this.balance;
    }
}