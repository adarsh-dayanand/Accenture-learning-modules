import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// Fill your code here
		System.out.println("Enter number of elements to add");
		int n=sc.nextInt();
		String[] str=new String[n+1];
		int[] arr=new int[n];
		int i;
		sc.nextLine();
		for(i=0;i<n;i++)
		{
		    System.out.println("Enter the country code");
		    arr[i]=sc.nextInt();
		    sc.nextLine();
		    System.out.println("Enter the country name");
		    str[i]=sc.nextLine();
		}
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		for(i=0;i<n;i++)
		{
		    map.put(arr[i],str[i]);
		}
		System.out.println(map);
	}

}