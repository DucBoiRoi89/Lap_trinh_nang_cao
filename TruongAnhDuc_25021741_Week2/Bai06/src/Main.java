class Main{
    public static void main(String[] args){
        Transaction transaction1 = new Transaction("1", "100", "01-02-2024");
        Transaction transaction2 = new Transaction("2", "200", "04-03-2024");
        Transaction[] history = new Transaction[]{transaction1, transaction2};
        Account account = new Account("1234", "2000", history);
        Transaction[] accountHistory1 = account.getHistory();
        Transaction transaction3 = accountHistory1[0];
        transaction3.amount = "9999999";
        accountHistory1[0] = null; 
        Transaction[] accountHistory2 = account.getHistory();
        System.out.println(accountHistory1[0]);
        System.out.println(accountHistory2[0]);
        System.out.println(accountHistory2[0].amount);
    }
}