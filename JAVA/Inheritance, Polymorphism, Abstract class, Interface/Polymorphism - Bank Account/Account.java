public abstract class Account{
    private String accountNo;
    private String accountName;
    private String accountType;
    private int noOfYears;
    private double balance;
    public abstract float calculateInterest();
    public String getAccountNo(){
        return accountNo;
    }
    public String getAccountName(){
        return accountName;
    }
    public String getAccountType(){
        return accountType;
    }
    public int getNoOfYears(){
        return noOfYears;
    }
    public double getBalance(){
        return balance;
    }
    public void setAccountNo(String accountNo){
        this.accountNo=accountNo;
    }
    public void setAccountName(String accountName){
        this.accountName=accountName;
    }
    public void setAccountType(String accountType){
        this.accountType=accountType;
    }
    public void setNoOfYears(int noOfYears){
        this.noOfYears=noOfYears;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
}