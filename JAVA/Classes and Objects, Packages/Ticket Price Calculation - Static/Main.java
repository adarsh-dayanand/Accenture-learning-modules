import java.util.Scanner;
public class Main 
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        Ticket obj=new Ticket();
        
        System.out.println("Enter no of bookings:");
        int no_bookings=sc.nextInt();
        
        System.out.println("Enter the available tickets:");
        obj.setAvailableTickets(sc.nextInt());
        
        while(no_bookings>0)
        {
        System.out.println("Enter the ticketid:");
        obj.setTicketid(sc.nextInt());
        
        System.out.println("Enter the price:");
        obj.setPrice(sc.nextInt());
        
        System.out.println("Enter the no of tickets:");
        int no_tickets=sc.nextInt();
        if(obj.calculateTicketCost(no_tickets)==-1)
        {
            continue;
        }
        
        System.out.println("Available tickets: "+obj.getAvailableTickets());
        
        System.out.println("Total amount:"+obj.calculateTicketCost(no_tickets));
        
        System.out.println("Available ticket after booking:"+obj.getAvailableTickets());
        
            no_bookings--;
        }
    }
}