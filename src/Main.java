import exceptions.DailyLimitExceededException;
import exceptions.InsufficientBalancedException;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new SavingsAccount(1500,250);
        Customer customer = new Customer("Farid", account);

        customer.showBalance();

        try{
            customer.deposit(500);
            customer.showBalance();
            customer.withdraw(200);
            customer.showBalance();
            customer.withdraw(100);
        } catch (InsufficientBalancedException e) {
            throw new RuntimeException(e.getMessage());
        } catch (DailyLimitExceededException e) {
            throw new RuntimeException(e.getMessage());
        }

    }
}