class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() - amount) >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Cannot withdraw. Minimum balance of 100 must be maintained.");
        }
    }
}

public class BankExample {
    public static void main(String[] args) {
        // Example usage
        BankAccount account = new SavingsAccount(500);

        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(200);
        System.out.println("Current Balance: " + account.getBalance());

        account.withdraw(50);
        System.out.println("Current Balance: " + account.getBalance());

        account.withdraw(200); // This should fail for SavingsAccount due to minimum balance requirement
        System.out.println("Current Balance: " + account.getBalance());
    }
}
