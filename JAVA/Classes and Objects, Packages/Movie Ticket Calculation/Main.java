import java.util.*;

public class Main{
    
    public static Movie getMovieDetails(){
        
        Movie m = new Movie();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the movie name:");
        String name=sc.nextLine();
        m.setMovieName(name);
        System.out.println("Enter the movie category:");
        String cat=sc.nextLine();
        m.setMovieCategory(cat);
        return m;
    }
    
    public static String getCircle(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the circle:");
        String c=sc.nextLine();
        return c;
    }
    
    public static void main(String[] args){
        Movie m1 = getMovieDetails();
        String c=getCircle();
        int a=m1.calculateTicketCost(c);
        System.out.println("Movie name = "+m1.getMovieName());
        System.out.println("Movie category = "+m1.getMovieCategory());
        
        if(a==-1)
        {
            System.out.println("Sorry there is no "+m1.getMovieCategory()+" type of category in theater.");
        }
        else if(a==-2)
        {
            System.out.println("Sorry!!! Circle is Invalid.");
        }
        else if(a==-3)
        {
            System.out.println("Sorry!!! Both circle and category are Invalid.");
        }
        else if(a==0)
        {
            System.out.println("The ticket cost is = "+m1.getTicketCost());
        }
    }
}













