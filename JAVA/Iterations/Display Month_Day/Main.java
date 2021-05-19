import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		while(true)
		{
		    System.out.println("1.Display the Months");
		    System.out.println("2.Display the Days");
		    System.out.println("3.Exit");
		    int ch=sc.nextInt();
		    switch(ch)
		    {
		        case 1:
		            System.out.println("1.January");
		            System.out.println("2.February");
		            System.out.println("3.March");
		            System.out.println("4.April");
		            System.out.println("5.May");
		            System.out.println("6.June");
		            System.out.println("7.July");
		            System.out.println("8.August");
		            System.out.println("9.September");
		            System.out.println("10.October");
		            System.out.println("11.November");
		            System.out.println("12.December");
		            break;
		        case 2:
		            System.out.println("1.Monday");
		            System.out.println("2.Tuesday");
		            System.out.println("3.Wednesday");
		            System.out.println("4.Thursday");
		            System.out.println("5.Friday");
		            System.out.println("6.Saturday");
		            System.out.println("7.Sunday");
		            break;
		        case 3:   
		            System.exit(0);
		        default:
		            System.exit(0);
		    }
		}
	}

}
