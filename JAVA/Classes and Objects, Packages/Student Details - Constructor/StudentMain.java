import java.util.Scanner;
public class StudentMain
{   public static void main (String[] args) 
    {
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Student's Id:");
       int studentId=sc.nextInt();
       sc.nextLine();
       
       System.out.println("Enter Student's Name:");
       String studentName=sc.nextLine();
       
       System.out.println("Enter Student's address:");
       String studentAddress=sc.nextLine();
       
       while(true)
       {
            System.out.println("Whether the student is from NIT(Yes/No):");
            String answer=sc.nextLine();
       
            if(answer.equalsIgnoreCase("yes"))
            {
                Student obj = new Student(studentId, studentName, studentAddress);
                System.out.println("Student id:"+obj.getStudentId());
                System.out.println("Student name:"+obj.getStudentName());
                System.out.println("Address:"+obj.getStudentAddress());
                System.out.println("College name:"+obj.getCollegeName());
                break;
            }
           
            else if(answer.equalsIgnoreCase("no"))
            {       
                System.out.println("Enter the college name:");
                String collegename=sc.nextLine();
                
                Student obj = new Student(studentId, studentName, studentAddress, collegename);
                
                System.out.println("Student id:"+obj.getStudentId());
                System.out.println("Student name:"+obj.getStudentName());
                System.out.println("Address:"+obj.getStudentAddress());
                System.out.println("College name:"+obj.getCollegeName());
                break;
            }
            
            else
            {
                System.out.println("Wrong Input");
            }
       }
    }
}