public class Token{
    
    private static int tokenNumber;
    private int counterNumber;
    private String serviceType;
    
    public Token(String serviceType){
        tokenNumber=tokenNumber+1;
        if(serviceType.equals("Others"))
            counterNumber=4;
        else if(serviceType.equals("Deposit"))
            counterNumber=3;
        else if(serviceType.equals("Withdraw"))
            counterNumber=2;
        else if(serviceType.equals("Cheque deposit"))
            counterNumber=1;
    }
    
    public static int getTokenNumber(){
        return tokenNumber;
    }
    
    public int getCounterNumber(){
        return counterNumber;
    }
    
    public String getServiceType(){
        return serviceType;
    }
}