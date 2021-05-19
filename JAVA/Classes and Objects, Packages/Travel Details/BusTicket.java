public class BusTicket{
    
    private int ticketNo;
    private float ticketPrice;
    private float totalAmount;
    private Person person;
    
    /*********** Getters ***************/
    public int getTicketNo()
    {
        return ticketNo;
    }
    public float getTicketPrice()
    {
        return ticketPrice;
    }
    public float getTotalAmount()
    {
        return totalAmount;
    }
    public Person getPerson()
    {
        System.out.println("Passenger Name:"+person.getName());
        return person;
    }
    
    /************** Setters *********/
    public void setTicketNo(int ticketNo)
    {
        this.ticketNo = ticketNo;
    }
    public void setTicketPrice(float ticketPrice)
    {
        this.ticketPrice = ticketPrice;
    }
    public void setTotalAmount(float totalAmount)
    {
        this.totalAmount = this.totalAmount;
    }
    public void setPerson(Person p)
    {
        this.person = p;
    }
    
    public void calculateTotal()
    {
        int age1=person.getAge();
        char g=person.getGender();
        float Amount=0;
        
        if(age1<16)
        {
            Amount=(ticketPrice*50)/100;
            totalAmount=ticketPrice - Amount;
        }
        else if(age1>=60)
        {
            Amount=(ticketPrice*25)/100;
            totalAmount=ticketPrice - Amount;
        }
        else if(age1>=16 && age1<60)
        {
            if(g=='f' || g=='F')
            {
                Amount=(ticketPrice*10)/100;
                totalAmount=ticketPrice - Amount;
            }
            else
            {
                totalAmount = ticketPrice;
            }
        }
        else
        {
            totalAmount = ticketPrice;
        }
        setTotalAmount(totalAmount);
    }
}










