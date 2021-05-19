import java.util.*;
public class  Main
{
    public static void main (String[] args) {
        int investment=100000, amount=0;
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter the profit percentage");
            int profit_percentage_1sty=sc.nextInt();
        
        System.out.println("Enter the amount lost in Rs.");
            int lost_amount_2ndy=sc.nextInt();
        
            int profit_amount_1sty=(profit_percentage_1sty*investment)/100;//BADMAS
            amount=(investment+profit_amount_1sty-lost_amount_2ndy);
        
        if(amount>investment)
        {   
            int profit=((amount-investment)*100)/investment;//BADMAS
            System.out.println("After two years he gets a profit of "+profit+"%");    
        }
        
        else if(amount==investment)
        {
            System.out.println("After two years he gets no loss or no gain");
        }
        
        else if(amount<investment)
        {
            int loss=((investment-amount)*100)/investment;//remember BADMAS while writing arithmetic expressions
            System.out.println("After two years he gets a loss of "+loss+"%");
        }
    }
}