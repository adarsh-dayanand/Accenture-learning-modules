import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the account no:");
		long accountNo=sc.nextLong();
		System.out.println("Enter the balance amount:");
		double balance=sc.nextDouble();
		System.out.println("Enter the beneficiary accountno:");
		long beneficiaryAccNo=sc.nextLong();
		System.out.println("Enter the amount to be transferred:");
		double amtTobeTransferred=sc.nextDouble();
		System.out.println("Enter the IFSC code:");
		String ifscCode=sc.next();
		
		//Fill Code
		Account a=new Account();
		a.setAccountNo(accountNo);
		a.setBalance(balance);
		try{
		    a.fundTransfer(accountNo, ifscCode, amtTobeTransferred);
		    System.out.println("Transaction completed successfully. The balance amount in your account is:"+String.format("%.1f",a.getBalance()));
		}catch(InvalidIFSCCodeException e){
		    System.out.println("InvalidIFSCCodeException: "+e.getMessage());
		}
	}
}
