import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n>0)
		{
		for(int i=0;i<n;i++)
		{
		    System.out.println(str);
		}
		}
		else
		{
		    System.out.println(n+ " is not a valid input");
		}
		// Fill the code
	}

}
