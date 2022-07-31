
public class SavingsAccount extends BankAccount{
	private double rate = 2.5;
	private int savingsNumber = 0;
	protected static String accountNumber;
	
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount.getOwner(), amount);
		savingsNumber++;
		accountNumber = accountNumber.substring(0,accountNumber.indexOf("-")) + "-" + savingsNumber;
		numberOfAccounts--;
	}
	
	public void postInterest() {
		deposit( getBalance()+ (getBalance()*rate));
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	

}
