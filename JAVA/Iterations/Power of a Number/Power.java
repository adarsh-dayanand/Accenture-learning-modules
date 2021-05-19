import java.util.*;
    public class Power {
         public static void main(String args[]){
             Scanner scan = new Scanner (System.in);
             long n, p;
             System.out.println("Enter the number");
             n = scan.nextLong();
             System.out.println("Enter the digit");
             p = scan.nextLong();
             if(n < 0 || p < 0) {
                System.out.println("Invalid input.");
                return;
             }
             if(n == 0 && p == 0) {
                 System.out.println("Invalid input");
                 return;
             }
             if (n > 0 && p == 0) {
                 System.out.println("1");
                 return;
             }
             if(n == 0 && p > 0) {
                 System.out.println("0");
                 return;
             }
             else 
                 System.out.println(power(n, p));
         }
         private static long power(long n, long p) {
             long result = n;
             for(int i=1; i<p; i++)
                 result *= n;
             return result;
         } 
   }