
public class CheckingAccount extends BankAcocount {
	public CheckingAccount(double initialBalance) {
		super(initialBalance);
		transactionCount = 0;
	}
	public void deposit(double amount) {
		transactionCount++;
		super.deposit(amount);
	}
	public void withdraw(double amount) {
		transactionCount++;
		super.withdraw(amount);
	}
	public void deductFees() {
		if (transactionCount > FREE_TRANSACTIONS) {
			double fees = TRANSATION_fee * (transactionCount - FREE_TRANSACTIONS);
			super.withdraw(fees);
		}
		transactionCount = 0;
	}
	private int transactionCount;
	private static final int FREE_TRANSATIONS = 3;
	private static final double TRANSACTION_FEE = 2.0;
}
