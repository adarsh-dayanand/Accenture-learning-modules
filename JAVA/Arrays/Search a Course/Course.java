import java.util.*;
public class Course
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of course:");
        int no_crs=sc.nextInt();
        if(no_crs>0)
                  { 
                    System.out.println("Enter course names:");
                
                    String crs[]=new String[no_crs];
                    
                    for(int i=0;i<no_crs;i++)
                    {
                        crs[i]=sc.next();
                    }
                    
                    System.out.println("Enter the course to be searched:");
                    String srch=sc.next();
                    
                    int flag=0;
                    for(int i=0;i<no_crs;i++)
                    {
                        if(srch.equals(crs[i]))
                        {
                            flag++;
                        }
                    }
                    
                    if(flag!=0)
                    {
                        System.out.println(srch+" course is available");
                    }
                    else
                    {
                        System.out.println(srch+" course is not available");
                    }
                }
                else
                {
                    System.out.println("Invalid Range");
                }
        
        
        
    }
}