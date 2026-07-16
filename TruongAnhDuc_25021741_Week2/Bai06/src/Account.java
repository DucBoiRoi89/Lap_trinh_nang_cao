class Account{
    String accountId;
    private String balance;
    private Transaction[] history;
    public Account(String accountId, String balance, Transaction[] history){
        this.accountId = accountId;
        this.balance = balance;
        this.history = history;
    }
    public void addTransaction(Transaction t){
        Transaction[] newHistory = new Transaction[history.length + 1];
        for(int i = 0; i < history.length; i++){
            newHistory[i] = history[i];
        }
        newHistory[history.length] = t;
        history = newHistory;
    }
    public Transaction[] getHistory(){
        Transaction[] copyHistory = new Transaction[history.length];
        for(int i = 0; i < history.length; i++){
            Transaction t = new Transaction(history[i].transactionId, history[i].amount, history[i].timestamp);
            copyHistory[i] = t;
        }
        return copyHistory;
    }
}