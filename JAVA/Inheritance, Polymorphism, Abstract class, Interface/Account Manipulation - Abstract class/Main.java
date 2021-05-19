import java.util.Scanner;
public class Main{
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int a2=sc.nextInt();
        String b2=sc.nextLine();
        sc.nextLine();
        String c2=sc.nextLine();
        Customer c=new Customer(a2,b2,c2);
        System.out.println("balance");
        double b=sc.nextDouble();
        System.out.println("min");
        double d=sc.nextDouble();
        System.out.println("amount");
        double f=sc.nextDouble();
        SavingsAccount a1=new SavingsAccount(a,c,b,d);
        boolean e=a1.withdraw(f);
        if(e==true)
        System.out.println("withdraw successful");
        else
        System.out.println("failed");
    }
}