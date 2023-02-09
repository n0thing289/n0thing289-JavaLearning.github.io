package eight;

public class Homework08 {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1000);
//        checkingAccount.deposit(10);
//        checkingAccount.withdraw(10);
        SavingAccount savingAccount = new SavingAccount(1399);
//        savingAccount.deposit(100);
//        savingAccount.deposit(100);
//        savingAccount.deposit(100);
//        savingAccount.deposit(100);
//        savingAccount.deposit(100);

        //月初
        System.out.println(savingAccount.earnMonthlyInterest());
        System.out.println(savingAccount.getBalance());
        savingAccount.withdraw(100);
        System.out.println(savingAccount.getBalance());
        savingAccount.withdraw(100);
        savingAccount.withdraw(100);
        System.out.println(savingAccount.getBalance());
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());
    }
}
