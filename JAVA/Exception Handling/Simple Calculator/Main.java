import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number 1:");
		int no1=sc.nextInt();
		System.out.println("Enter Number 2:");
		int no2=sc.nextInt();
		System.out.println("Type of operation:");
		String op=sc.next();
		char ope=op.charAt(0);
	    
	    //FILL THE CODE
	
        Calculator cal=new Calculator();
        cal.setNo1(no1);
        cal.setNo2(no2);
        cal.setOperation(ope);
        int result=cal.performCalculation();
        System.out.println(result);

	}

}
