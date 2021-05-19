import java.util.*;
public class Bank {
    
    public static String determineAccountType(String accountType){
        return accountType;
    }
    
    public static void main(String[] args){
        //Implement code here
        boolean isCurrent=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Account Type(saving/current)");
        String account_type=determineAccountType(sc.nextLine());
        System.out.println("Enter the Account Number");
        String account_no=sc.nextLine();
        System.out.println("Enter the Account Name");
        String name=sc.nextLine();
        System.out.println("Enter the No of years:");
        int yearno=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the balanced:");
        double balance=sc.nextDouble();
        int trans_no=0;
        if(account_type.equalsIgnoreCase("current")){
            isCurrent=true;
            System.out.println("Enter the number of Transaction: ");
            trans_no=sc.nextInt();
        }
        if(isCurrent){
            Account a=new CurrentAccount();
            a.setAccountName(name);
            a.setAccountNo(account_no);
            a.setAccountType(account_type);
            a.setNoOfYears(yearno);
            a.setBalance(balance);
            ((CurrentAccount)a).setNoOfTransactionPerMonth(trans_no);
            float interest=a.calculateInterest();
            System.out.println("The Interest for "+a.getAccountName()+" of Account Type "+a.getAccountType()+" is "+interest);
        }else{
            Account a=new SavingsAccount();
            a.setAccountName(name);
            a.setAccountNo(account_no);
            a.setNoOfYears(yearno);
            a.setAccountType(account_type);
            a.setBalance(balance);
            ((SavingsAccount)a).setMinBalance(5000);
            float interest=a.calculateInterest();
            System.out.println("The Interest for "+a.getAccountName()+" of Account Type "+a.getAccountType()+" is "+interest);
        }
    }
}