import java.util.Scanner;
public class Main
{
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 'E' for Electric Kettle and 'I' for Induction Stove(No other character will be accepted)");
        char op=sc.next().charAt(0);
        System.out.println("Enter the number of units ordered");
        int n=sc.nextInt();
        int tot=0;
        switch(op)
        {
            case 'E':
                {
                    if(n>=21)
                    {
                        tot=n*850;
                    }
                    else if(n>=11)
                    {
                        tot=n*900;
                    }
                    else
                    {
                        tot=n*950;
                    }
                    break;
                }
                
            case 'I':
                {
                    if(n>=26)
                    {
                        tot=n*975;
                    }
                    else if(n>=16)
                    {
                        tot=n*1000;
                    }
                    else
                    {
                        tot=n*1100;
                    }
                    break;
                }
                
        }
        System.out.println("Total amount to be paid is Rs."+tot);
    }
}