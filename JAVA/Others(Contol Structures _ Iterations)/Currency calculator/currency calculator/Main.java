import java.util.*;
import java.text.DecimalFormat;
public class  Main 
{
    public static void main (String[] args) {
        String country_code[]={"CAD", "HKD", "SGD", "USD"};
        String country_name[]={"Canada", "Hong Kong", "Singapore", "USA"};
        double exg_rate[]={52.08, 8.86, 51.29, 69.55};
        int flag=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the currency code");
            String cur=sc.nextLine().toUpperCase();
            
        
            
            for(int i=0;i<=3;i++)
            {
                if(cur.equals(country_code[i]))
                { 
                    System.out.println("Enter the amount");
                    int amt=sc.nextInt();
                    double ans=amt*exg_rate[i];
                    DecimalFormat f= new DecimalFormat("########0.00");
                    System.out.println(country_name[i]+" dollar "+amt+" equals to "+f.format(ans)+" Indian Rupee");
                    flag++;
                    break;
                }
            }
            
            if(flag==0)
            {
                System.out.println("Currency code not found");
            }
    }
}