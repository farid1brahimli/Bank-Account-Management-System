import exceptions.DailyLimitExceededException;
import exceptions.InsufficientBalancedException;

public abstract class BankAccount {
    protected double balance;
    protected double dailyLimit;
    protected double withdrawnToday;

    public BankAccount(double balance, double dailyLimit) {
        this.balance = balance;
        this.dailyLimit = dailyLimit;
        this.withdrawnToday = 0;
    }

    public BankAccount(){
        this.balance = 0;
        this.dailyLimit = 0;
        this.withdrawnToday = 0;
    }

    public abstract void withdraw(double amount)
            throws InsufficientBalancedException, DailyLimitExceededException;

    public void deposit(double amount) {
        if (amount > 0){
            balance += amount;
            System.out.println("Deposited " + amount + " to balance");
        }
    }

    public double getBalance(){
        return balance;
    }
}


