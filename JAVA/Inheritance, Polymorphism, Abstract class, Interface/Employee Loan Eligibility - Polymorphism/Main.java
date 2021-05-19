import java.util.Scanner;
public class Main{
   
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String b=sc.nextLine();
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        int e=sc.nextInt();
        int f=sc.nextInt();
        Employee e1=new PermanentEmployee(a,b,d);
        e1.calculateSalary();
        Employee e2=new TemporaryEmployee(a,b,e,f);
        e2.calculateSalary();
        Loan l=new Loan();
        l.calculateLoanAmount(e1);
        l.calculateLoanAmount(e2);
    }
    
}