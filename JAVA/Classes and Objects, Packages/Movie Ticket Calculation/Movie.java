public class Movie{
    
    private String movieName,movieCategory;
    private int ticketCost;
    
    public void setMovieName(String movieName)
    {
        this.movieName=movieName;
    }
    public String getMovieName()
    {
        return movieName;
    }
    public void setMovieCategory(String cat)
    {
        this.movieCategory=cat;
    }
    public String getMovieCategory(){
        return movieCategory;
    }
    public void setTicketCost(int cost){
        this.ticketCost=cost;
    }
    public int getTicketCost(){
        return ticketCost;
    }
    
    public int calculateTicketCost(String circle)
    {
        if(!circle.equalsIgnoreCase("GOLD") && !circle.equalsIgnoreCase("SILVER") && (movieCategory.equalsIgnoreCase("2D") || movieCategory.equalsIgnoreCase("3D")))
        {
            return -2;
        }
        else if((circle.equalsIgnoreCase("GOLD") || circle.equalsIgnoreCase("SILVER")) && !movieCategory.equalsIgnoreCase("2D") && !movieCategory.equalsIgnoreCase("3D"))
        {
            return -1;
        }
        else if((!circle.equalsIgnoreCase("GOLD")) && (!circle.equalsIgnoreCase("SILVER")) && (!movieCategory.equalsIgnoreCase("2D")) && (!movieCategory.equalsIgnoreCase("3D")))
        {
            return -3;
        }
        else{
            if(circle.equalsIgnoreCase("GOLD") && movieCategory.equalsIgnoreCase("2D"))
                ticketCost=300;
            else if(circle.equalsIgnoreCase("GOLD") && movieCategory.equalsIgnoreCase("3D"))
                ticketCost=500;
            else if(circle.equalsIgnoreCase("SILVER") && movieCategory.equalsIgnoreCase("2D"))
                ticketCost=250;
            else if(circle.equalsIgnoreCase("SILVER") && movieCategory.equalsIgnoreCase("3D"))
                ticketCost=450;
                return 0;
        }
    }
    
}

















