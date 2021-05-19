import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// Fill your code here
		System.out.println("Enter number of elements to add");
		int n=sc.nextInt();
		String[] str=new String[n+1];
		int i;
		for(i=0;i<n+1;i++)
		{
		    str[i]=sc.nextLine();
		}
		TreeSet<String> veg=new TreeSet<String>();
		for(i=1;i<=n;i++)
		{
		    veg.add(str[i]);
		}
		Iterator<String> it=veg.iterator();
		while(it.hasNext())
		{
		    System.out.println(it.next());
		}
	}

}