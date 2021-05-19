import java.util.*;
import java.text.DecimalFormat;
public class Test 
{   
    
    double calculateAverage(int[] age)
    {
        int len=age.length;
        double sum=0.0;
        for(int i=0;i<len;i++)
        {
            sum+=age[i];
        }
        double avg=sum/len;
        return avg;
    }
    
    public static void main (String[] args) {
        Scanner sc =new Scanner(System.in);
        Test obj=new Test();
        
        System.out.println("Enter total no.of employees:");
        int n=sc.nextInt();
        int flag=0;
        if(n>1)
        { int[] age=new int[n];
            System.out.println("Enter the age for "+n+" employees:");
            
            for(int i=0;i<n;i++)
            {
                int temp=sc.nextInt();
                if(temp>=28 && temp<=40)
                {
                    age[i]=temp;
                }
                else
                {
                    System.out.println("Invalid age encountered!");
                    flag++;
                    break;
                }
            }
            
            if(flag==0)
            {   DecimalFormat df=new DecimalFormat("####.00");
                System.out.println("The average age is "+df.format(obj.calculateAverage(age)));
            }
        }
        else
        {
            System.out.println("Please enter a valid employee count");
        }
    }
}