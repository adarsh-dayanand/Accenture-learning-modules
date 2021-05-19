import java.util.Scanner;
public class ReverseDriver{
    public static void main(String[] args) 
    { String str;
      System.out.print("Enter the string: ");
      Scanner scanner=new Scanner(System.in);
      str=scanner.nextLine();
      scanner.close();
      String reversed =reverseString(str);
      System.out.println("Reversed string is: "+ reversed);
    }
    public static String reverseString(String str)
    { if(str.isEmpty())
         return str;
      return reverseString(str.substring(1))+str.charAt(0);
    }
    
    
}