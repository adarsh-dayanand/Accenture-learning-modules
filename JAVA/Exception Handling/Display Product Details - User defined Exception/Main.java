import java.util.*;

public class Main {
    
    static void validate(int price) throws InvalidPriceException
    {
        if(price<100)
        throw new InvalidPriceException("InvalidPriceException");
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter product name");
		String str=sc.nextLine();
		System.out.println("Enter price");
		try {
		    int n=sc.nextInt();
		    validate(n);
		    System.out.println("Name : "+str);
		    System.out.println("Price : "+n);
		} 
		catch(InvalidPriceException e) {
		System.out.println(e+" - Product price invalid");
	    //FILL THE CODE
		}
	}
}
