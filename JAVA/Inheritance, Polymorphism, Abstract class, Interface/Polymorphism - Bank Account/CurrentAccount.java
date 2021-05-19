public class CurrentAccount extends Account{
    private int noOfTransactionPerMonth;
    private int getNoOfTransactionPerMonth(){
        return noOfTransactionPerMonth=noOfTransactionPerMonth;
    }
    public void setNoOfTransactionPerMonth(int noOfTransactionPerMonth){
        this.noOfTransactionPerMonth=noOfTransactionPerMonth;
    }
    public float calculateInterest(){
        float intRate=3.0F;
        float interest=intRate/100;
        interest=interest*(float)getBalance()*(float)getNoOfYears();
        if(noOfTransactionPerMonth<=8)
            return interest;
        return 0;
    }
    
}