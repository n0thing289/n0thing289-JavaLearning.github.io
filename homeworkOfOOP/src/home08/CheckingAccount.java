package home08;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    public void deposit(double amount) {
        super.deposit(amount -1);
        System.out.println(getBalance());
    }

    public void withdraw(double amount) {
        super.deposit(amount -1);
        System.out.println(getBalance());
    }
}
