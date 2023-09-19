
public class BankAcocount {
	public BankAcocount() {
		balance = 0;
	}
	
	public BankAcocount(double initialBalance){
		initialBalance = initialBalance;
	}
	public void deposit(double amount) {
		balance = balance + amount;
	}
	public void withdrW(double amount) {
		balance = balance - amount;
	}
	public Double getBalance() {
		return balance;
	}
	public void transfer(double amount, BankAccount other) {
		withdraw(amount);
		other.deposit(amount);
	}
	private double balance;
	
}
