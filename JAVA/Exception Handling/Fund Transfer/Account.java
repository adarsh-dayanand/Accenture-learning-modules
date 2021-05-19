
public class Account {
	private long accountNo;
	private double balance;
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public Account(){}
	
	public void fundTransfer(long beneficiaryAccountNo, String ifscCode, double amtTobeTransferred) throws InvalidIFSCCodeException//Fill the exception
	{
		//FILL CODE
		if(ifscCode.length()==11 && ifscCode.matches("[A-Z]{4}[0-9]{7}")){
		    balance=balance-amtTobeTransferred;
		}else
		  throw new InvalidIFSCCodeException("Invalid IFSCCode");
	}
}
