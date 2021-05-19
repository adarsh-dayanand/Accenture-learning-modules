import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// Fill your code here
		System.out.println("Enter number of elements to add");
		int n=sc.nextInt();
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		for(int i=0;i<n;i++)
		{
		    System.out.println("Enter the country code");
		    int ar=sc.nextInt();
		    System.out.println("Enter the country name");
		    sc.nextLine();
		    String str=sc.nextLine();
		    map.put(ar,str);
	    }
	    for(Map.Entry m:map.entrySet())
	    {
	        System.out.println(m.getKey()+" : "+m.getValue());
	    }

}
}