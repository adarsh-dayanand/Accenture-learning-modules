public class Ticket
{
    private int ticketid;
    private int price;
    private static int availableTickets;
    
    public void setTicketid(int ticketid)
    {
        this.ticketid=ticketid;
    }
    
    public int getTicketid()
    {
        return this.ticketid;
    }
    
    public void setPrice(int price)
    {
        this.price=price;
    }
    
    public int getPrice()
    {
        return this.price;
    }
    
    public static void setAvailableTickets(int availableTickets1)
    {   if(availableTickets1>=0)
        {
            availableTickets=availableTickets1;
        }
    }
    
    public static int getAvailableTickets()
    {
        return availableTickets;
    }
    
    public int calculateTicketCost(int nooftickets)
    {   
        if(availableTickets>=nooftickets)
        {   
            availableTickets-=nooftickets;
            return nooftickets*this.price;
        }
        else
        {
            return -1;
        }
    }
}