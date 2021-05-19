import java.util.Scanner;
public class Calculator
{
    public static Calculate performAddition()
    {
        Calculate c=(a,b)->{
            return (a+b);
        };
        return c;
    }
    public static Calculate performSubtraction()
    {
        Calculate c=(a,b)->{
            return (a-b);
        };
        return c;
    }
    public static Calculate performProduct()
    {
        Calculate c=(a,b)->{
            return (a*b);
        };
        return c;
    }
    public static Calculate performDivision()
    {
        Calculate c=(a,b)->{
            return((float)a/(float)b);
        };
        return c;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        Calculate r1,r2,r3,r4;
        r1=performAddition();
        r2=performSubtraction();
        r3=performProduct();
        r4=performDivision();
        System.out.println("The sum is "+r1.performCalculation(x,y));
        System.out.println("The difference is "+r2.performCalculation(x,y));
        System.out.println("The product is "+r3.performCalculation(x,y));
        System.out.println("The division value is "+r4.performCalculation(x,y));
    }
}