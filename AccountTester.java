
public class AccountTester {
	public static void main(String[] args)
	{
		
		SavingsAccount momsSavings = new SavingsAccount(0.5);
		CheckingAccount harrysChecking = new CheckingAccount(100);
		
		momsSavings.deposit(10000);
		momsSavings.transfer(2000, harrysChecking);
		harrysChecking.withdraw(80);
		momsSavings.transfer(1000, harrysChecking);
		harrysChecking.withdraw(400);
		momsSavings.addIntrest();
		harrysChecking.deductFees();
		System.out.println("Mom's Savings balance = $" + momsSavings.getBalance());
		System.out.println("Harry's Checking balance = $" + harrysChecking.getBalance());

		
		
		
		
		
		
		
		
		
		
	}
}
