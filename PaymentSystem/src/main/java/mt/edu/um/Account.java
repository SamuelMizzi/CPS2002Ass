package mt.edu.um;

public class Account {
	
	private int accountNumber;
	private String accountName;
	private long accountBalance;
	
	public Account(){
		accountNumber = 0;
		accountName = null;
		accountBalance = 0;
	}
	
	public Account(int accNo, String accName, long accBal){
		setAccountNumber (accNo);
		accountName = accName;
		accountBalance = accBal;
	}
	
	public void setAccountNumber (int accNo){
		accNo = accountNumber;
	}
	
	public void setAccountName (String accName){
		accName = accountName;
	}
	
	public void setAccountBalance (long accBal){
		accBal = accountBalance;
	}
	
	int getAccountNumber (){
		return accountNumber;
	}
	
	String getAccountName (){
		return accountName;
	}
	
	long getAccountBalance (){
		return accountBalance;
	}
	
	
	

}
