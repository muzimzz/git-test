package access.BankAccount;

public class BankAccount {

    private int balance;

    public BankAccount() {
        balance = 0;
    }

    public BankAccount(int amount) {
        balance = amount;
    }

    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 입금금액");
        }
    }

    public void withdraw(int amount) {
        if (isAmountValid(amount) && (balance >= amount)) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족");
        }
    }

    public int getBalance() {
        return balance;
    }

    private boolean isAmountValid(int amount) {
        return amount > 0;
    }

}
