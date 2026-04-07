package access.BankAccount;

public class BankAccountMain {
    public static void main(String args[]) {
        BankAccount account = new BankAccount(10000);
        account.withdraw(3000);
        account.withdraw(10000);
        account.deposit(15000);
        System.out.println("잔액: " + account.getBalance());
    }
}
