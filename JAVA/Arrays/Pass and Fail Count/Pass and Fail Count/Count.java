import java.util.*;
public class Count {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the no of subjects:");
        int no_sub=sc.nextInt();
        
        if(no_sub>0 && no_sub<=20)
        {
            int marks[]=new int[no_sub];
            
            for(int i=0;i<no_sub;i++)
            {
                marks[i]=sc.nextInt();
            }

            int pass=0,fail=0;
            for(int i=0;i<no_sub;i++)
            {
                if(marks[i]<50)
                {
                    fail++;
                }
                else
                {
                    pass++;
                }
            }
            
                if(fail==0)
                {
                    System.out.println("Ram passed in all subjects");
                }
                else if(pass==0)
                {
                    System.out.println("Ram failed in all subjects");
                }
                else
                {
                    System.out.println("Ram passed in "+pass+" subjects and failed in "+fail+" subjects");
                }
        }
        else
        {
            System.out.println("Invalid input range");
        }
        
    }
}