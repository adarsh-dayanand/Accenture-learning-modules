import java.util.*;
public class StudentMain 
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the id:");
        int id=sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter the name:");
        String name=sc.nextLine();
        
        System.out.println("Enter the number of subjects:");
        int n=sc.nextInt();
        int marks[]=new int[n];
        
        for(int i=0;i<n;i++)
        {   System.out.println("Enter mark for subject "+(i+1)+":");
            marks[i] = sc.nextInt();
        }
        
        Student obj=new Student();
        obj.setName(name);
        obj.setId(id);
        obj.setMarks(marks);
        obj.calculateAvg();
        obj.findGrade();
        
        System.out.println("Id:"+obj.getId());
        System.out.println("Name:"+obj.getName());
        System.out.println("Average:"+obj.getAverage());
        System.out.println("Grade:"+obj.getGrade());
    }
}