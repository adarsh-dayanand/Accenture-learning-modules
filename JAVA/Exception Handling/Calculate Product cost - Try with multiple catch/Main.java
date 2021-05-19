import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		    System.out.println("Enter the total cost of photo frames");
		    int tot=sc.nextInt();
		    System.out.println("Enter the number of photo frames");
		    int n=sc.nextInt();
		    int cost=tot/n;
		    System.out.println("Cost of each photo frame is "+cost);
		    
		} catch(InputMismatchException e) {
		    System.out.println("InputMismatchException : Input should be an integer");
		} 
		catch(ArithmeticException e)
		{
		    System.out.println("ArithmeticException : Cannot divide by zero");
		}
	    //FILL THE CODE
	
	}

}
