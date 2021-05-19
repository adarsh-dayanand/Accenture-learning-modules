import java.util.*;

public class Main{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int employee_count;
        int count=0;
        employee_count=sc.nextInt();
        sc.nextLine();
        String time[]=new String[employee_count];
        
        for(int i=0;i<employee_count;i++){
            time[i]=sc.next();
            if(time[i].charAt(0)<'9')
                continue;
            else if(time[i].charAt(0)>'9')
                count++;
            else if(time[i].charAt(2)>'3')
                count++;
            else if(time[i].charAt(2)=='3' && time[i].charAt(3)>'0')
                count++;
        }
        
        if(count==employee_count)
            System.out.println("All employees are late");
        else if(count==1)
            System.out.println("1 employee is late");
        else if(count==0)
            System.out.println("All employees are on time");
        else
            System.out.println(count+" employees are late");
    }
}