import java.util.*;

public class Count{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        if(name.matches("^[a-zA-Z ]*$")){
            System.out.println(name+" has "+name.length()+" characters");
        }
        else{
            System.out.println("Invalid input");
        }
    }
}