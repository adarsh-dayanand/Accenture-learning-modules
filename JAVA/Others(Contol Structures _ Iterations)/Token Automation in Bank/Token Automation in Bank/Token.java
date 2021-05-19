public class Token{
   private static int tokenNumber ;
   private int counterNumber;
   private String serviceType;
   
   public Token(String serviceType)
   {
       this.serviceType=serviceType;
        tokenNumber++;
        
   }
   public static int getTokenNumber()
   {
       return tokenNumber;
   }
   public int getCounterNumber()
   {
       if(serviceType.equals("Deposit")) counterNumber=3;
       else if(serviceType.equals("Withdraw")) counterNumber=2;
       else if(serviceType.equals("Cheque deposit")) counterNumber=1;
       else counterNumber=4;
       return counterNumber;
   }
   public String getServiceType()
   {
       return serviceType;
   }
}