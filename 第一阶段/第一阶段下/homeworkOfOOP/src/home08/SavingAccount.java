package home08;

public class SavingAccount extends BankAccount{
    private int firstMonth;
    private double interests;
    private double rate = 0.01;
    private int freeTimes = 3;
    private boolean isNewMonth = false;
    public SavingAccount(double initialBalance){
        super(initialBalance);
//        this.firstMonth = date;
    }

    @Override
    public void deposit(double amount) {
        if(freeTimes <= 0){
            super.deposit(amount - 1);
        }else{
            super.deposit(amount);
        }

        freeTimes--;
    }

    @Override
    public void withdraw(double amount) {
        if(freeTimes <= 0){
            super.withdraw(amount-1);
        }else{
            super.withdraw(amount);
        }

        freeTimes--;
    }

    public double earnMonthlyInterest(){
        interests = getBalance() * rate;
        super.deposit(interests);
        return interests;
    }

}
