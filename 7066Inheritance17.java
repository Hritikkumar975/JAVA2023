abstract class BankAccount{
    protected double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public double getBalance() {
        return balance;
    }
}
class SavingsAccount extends BankAccount {
    private double interestRate;
    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }
    @Override
    public void deposit(double amount) {
        balance += amount;
        calculateInterest();
    }
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            calculateInterest();
        } else {
            System.out.println("Insufficient funds for withdrawal");
        }
    }
    private void calculateInterest() {
        balance += balance * interestRate;
    }
}
class CurrentAccount extends BankAccount {
    private double overdraftLimit;
    public CurrentAccount(double initialBalance, double overdraftLimit) {
        super(initialBalance);
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public void deposit(double amount) {
        balance += amount;
    }
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal exceeds overdraft limit");
        }
    }
}
public class Example{
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);
        CurrentAccount currentAccount = new CurrentAccount(500, 200);
        System.out.println("Initial balances:");
        System.out.println("Savings Account: " + savingsAccount.getBalance());
        System.out.println("Current Account: " + currentAccount.getBalance());
        savingsAccount.deposit(200);
        currentAccount.deposit(100);
        System.out.println("\nBalances after deposits:");
        System.out.println("Savings Account: " + savingsAccount.getBalance());
        System.out.println("Current Account: " + currentAccount.getBalance());
        savingsAccount.withdraw(150);
        currentAccount.withdraw(300);
        System.out.println("\nBalances after withdrawals:");
        System.out.println("Savings Account: " + savingsAccount.getBalance());
        System.out.println("Current Account: " + currentAccount.getBalance());
    }
}
