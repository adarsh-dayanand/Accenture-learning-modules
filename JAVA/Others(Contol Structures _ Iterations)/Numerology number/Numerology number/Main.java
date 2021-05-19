import java.util.Scanner;
public class Main 
{
    public static void main (String[] args)
    {
        String str_num="";
        int sum=0, even_numbers=0, odd_numbers=0, numerology_number=0, r=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int temp=num;
        
        while(temp>0)
        {
            r=temp%10;
            str_num=(char)(r+'0')+" "+str_num; //(char)(r+'0') makes the int printable.
            sum+=r;
            if(r%2==0)
            {
                even_numbers++;
            }
            else
            {
                odd_numbers++;
            }
            temp/=10;
        }
        numerology_number=sum;
        Main obj=new Main();
        while(numerology_number>9)
        {
            numerology_number=obj.numer(numerology_number);
        }
        
       
        
        System.out.println("The Numbers are : "+str_num);
        System.out.println("Sum of digits : "+sum);
        System.out.println("Numerology number: "+numerology_number);
        System.out.println("Number of odd numbers: "+odd_numbers);
        System.out.println("Number of even numbers: "+even_numbers);
    
    }
    
    int numer(int a)
    {   
        int ans=0, temp=a, r=0;
        while(temp>0)
        {
            r=temp%10;
            ans+=r;
            temp/=10;
        }
        return ans;
    }
}