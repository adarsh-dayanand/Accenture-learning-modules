import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        Main obj = new Main();
        
        int num=0,no=0;
        int yr;
        System.out.println("Enter 3 integers for the day of the month, month and year");
        num = sc.nextInt();
        no = sc.nextInt();
        yr = sc.nextInt();
        String suff = obj.extension(num);
        String mont = obj.month(no);
        System.out.println(suff+" "+mont+" "+yr);
    }
    
    String extension(int num)
    {
        String[] suffix = {"th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th"};
        int n = num%100;
        return String.valueOf(num)+suffix[(n > 3 && n < 21) ? 0 : (n%10)];
    }
    
    String month(int no)
    {
        String[] mon = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        return mon[no-1];
    }
}