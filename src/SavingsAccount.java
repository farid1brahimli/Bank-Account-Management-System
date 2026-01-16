import exceptions.DailyLimitExceededException;
import exceptions.InsufficientBalancedException;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(double balance, double dailyLimit) {
        super(balance, dailyLimit);
    }

    @Override
    public void withdraw(double amount)
            throws InsufficientBalancedException, DailyLimitExceededException {
        if (amount > balance) {
            throw new InsufficientBalancedException("Dont have enough money in your balance");
        }

        if (withdrawnToday + amount > dailyLimit) {
            throw new DailyLimitExceededException("Daily limit exceeded");
        }

        balance -= amount;
        withdrawnToday += amount;
        System.out.println(amount + "$ money is amounted");
    }
}
