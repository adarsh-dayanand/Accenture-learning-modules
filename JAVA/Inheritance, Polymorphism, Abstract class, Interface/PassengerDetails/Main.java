import java.util.*;

public class Main{
    public static void main (String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the no.of passengers:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Passenger "+i);
            System.out.println("Enter the ticketid:");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the name:");
            String name=sc.nextLine();
            System.out.println("Enter the gender:");
            String g=sc.nextLine();
            System.out.println("Enter the address:");
            String a=sc.nextLine();
            
            Passenger p=new Passenger(id,name,g,a);
            System.out.println(p.toString());
        }
    }
}