import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] str=new String[5];
		for(int i=0;i<5;i++)
		{
		    
		    str[i]=sc.nextLine();
		}
		int n=sc.nextInt();
		try{
		    System.out.println(str[n]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		    System.out.println("Index is out of bounds of the array");
		}
		finally
		{
		    System.out.println("Thank you Have a nice day");
		}
	
	}

}
