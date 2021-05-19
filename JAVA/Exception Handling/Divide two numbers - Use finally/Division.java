import java.util.*;

public class Division{
    
    public String divideTwoNumbers(int number1, int number2){
        String str="";
        int res;
        try{
            res=number1/number2;
            str="The answer is "+Integer.toString(res);
        }
        catch (ArithmeticException e){
            str="Division by zero is not possible";
        }
        finally{
            str=str.concat(". Thanks for using the application.");
            return str;
        }
    }
    
    public static void main (String[] args) {
        
        Scanner sc=  new Scanner(System.in);
        Division obj = new Division();
        System.out.println("Enter the numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(obj.divideTwoNumbers(a,b));
    }
}