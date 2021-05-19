import java.util.*;

public class TestMain{
    
    public static BusTicket getTicketDetails()
    {
        Scanner sc = new Scanner(System.in);
        BusTicket bt = new BusTicket();
        
        System.out.println("Enter the passenger name:");
        String name = sc.nextLine();
        System.out.println("Enter the gender(M or F / m or f):");
        char gender = sc.next().charAt(0);
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        sc.nextLine();
        
        Person p = new Person();
        p.setName(name);
        p.setGender(gender);
        p.setAge(age);
        bt.setPerson(p);
        
        System.out.println("Enter the ticket no:");
        int ticketNo = sc.nextInt();
        bt.setTicketNo(ticketNo);
        sc.nextLine();
        System.out.println("Enter the ticket price:");
        float ticketprice = sc.nextFloat();
        bt.setTicketPrice(ticketprice);
        
        return bt;
    }
    
    public static void main(String[] args)
    {
        TestMain tm = new TestMain();
        BusTicket bt_1 = new BusTicket();
        
        bt_1 = tm.getTicketDetails();
        bt_1.calculateTotal();
        System.out.println("Ticket no:"+bt_1.getTicketNo());
        bt_1.getPerson();
        System.out.println("Price of a ticket :"+bt_1.getTicketPrice());
        System.out.println("Total Amount :"+bt_1.getTotalAmount());
    }
}













