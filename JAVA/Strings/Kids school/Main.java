import java.util.*;

public class Main{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String word;
        int result=0,x,y;
        
        word=sc.next();
        x=sc.nextInt();
        sc.nextLine();
        y=sc.nextInt();
        sc.nextLine();
        if(((y-x)%word.length())==0)
            System.out.println("Same");
        else
            System.out.println("Not Same");
    }
}