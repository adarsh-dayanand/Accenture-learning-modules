import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// Fill your code here
		System.out.println("Enter number of elements to add");
		int n=sc.nextInt();
		TreeSet<String> veg=new TreeSet<String>();
		int i;
		String[] str=new String[n+1];
		for(i=0;i<=n;i++)
		{
		    str[i]=sc.nextLine();
		}
		for(i=1;i<=n;i++)
		veg.add(str[i]);
		System.out.println(veg);
	}

}