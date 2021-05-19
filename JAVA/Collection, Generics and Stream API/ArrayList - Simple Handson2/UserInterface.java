import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// Fill your code here
		System.out.println("Enter number of elements to add");
		int n=sc.nextInt();
	    String[] str=new String[n+1];
	    int i;
	    for(i=0;i<=n;i++)
	    str[i]=sc.nextLine();
	    ArrayList<String> fruit=new ArrayList<String>();
	    for(i=1;i<=n;i++)
	    {
	        fruit.add(str[i]);
	    }
	    for(i=0;i<n;i++)
	    {
	        System.out.println(fruit.get(i));
	    }
	    
	}

}