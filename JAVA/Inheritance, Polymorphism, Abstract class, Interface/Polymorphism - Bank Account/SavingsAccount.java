public class SavingsAccount extends Account{
    
    private float minBalance;
    public float getMinBalance(){
        return minBalance;
    }
    public void setMinBalance(float minBalance){
        this.minBalance=minBalance;
    }
    public float calculateInterest(){
        float intRate=3.5F;
        if(getBalance()>200000)
            intRate=4;
        if(getBalance()<getMinBalance())
            return 0;
        float intrest=intRate/100;
        intrest=intrest*(float)getNoOfYears()*(float)getBalance();
        return intrest;
    }
}