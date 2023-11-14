public class account
{
	private double balance;
	private double interest;

	public account()
	{
		balance = 0;
		interest = 0;
	}

	public account(double initialBalance, double initialInterest)
	{
		balance = initialBalance;
		interest = initialInterest;
	}

	public void deposit(double amount)
	{
		balance = balance + amount;
	}

	public void withdraw(double amount)
	{
		balance = balance - amount;
	}

	public void addInterest()
	{
		balance = balance + balance * interest;
	}

	public double getBalance()
	{
		return balance;
	}
    public static void main(String[] args)
	{
		account Savings = new account(5000, 0.10);
		Savings.withdraw(500);
		Savings.deposit(100);
		
		System.out.println("remaining balance = " +Savings.getBalance());
    }
}
