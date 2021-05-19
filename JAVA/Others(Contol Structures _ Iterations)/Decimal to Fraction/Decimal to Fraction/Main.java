import java.util.*;
public class Main 
{
    public static void fraction(double x)
    {   Main obj=new Main();
        String a=""+x;
        String splits[]=a.split("\\.");
        int b=splits[1].length();
        int denominator=(int)Math.pow(10, b);
        int numerator=(int)(x*denominator);
        
        int gcd=obj.getGCD(numerator, denominator);
        
        String fraction=""+numerator/gcd+"/"+denominator/gcd;
       System.out.println("Fraction: "+fraction);
    }
    
    int getGCD(int n1, int n2)
    {
        if(n2==0)
        {
            return n1;
        }
        
        return getGCD(n2, n1%n2);
    }
    
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        if(a==(int)(a))
        {
            System.out.println("Input a decimal number");
        }
        else{
            fraction(a);
        }
    }
}