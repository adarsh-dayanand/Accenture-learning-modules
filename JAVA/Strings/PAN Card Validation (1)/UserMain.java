import java.util.*;
 public class UserMain{
     public static void main (String[] args) {
         Scanner in=new Scanner(System.in);
         System.out.println("Enter your PAN number");
         String s1=in.nextLine();
         if(s1.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}"))
         {
             System.out.println("Valid PAN number");
         }
         else{
             System.out.println("Invalid PAN number");
         }
     }
 }