import exceptions.DailyLimitExceededException;
import exceptions.InsufficientBalancedException;

public class Customer extends BankAccount{
    private String name;
    private BankAccount account;

    public Customer(String name, BankAccount account){
        this.name = name;
        this.account = account;
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount)
    throws InsufficientBalancedException, DailyLimitExceededException {
        account.withdraw(amount);
    }

    public void showBalance() {
        System.out.println(name + "'s balans: " + account.getBalance());
    }
}


