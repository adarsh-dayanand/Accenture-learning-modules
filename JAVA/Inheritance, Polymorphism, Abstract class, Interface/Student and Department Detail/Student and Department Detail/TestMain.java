import java.util.Scanner;
public class TestMain
{
    public static Student createStudent()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Department id:");
        int did=sc.nextInt();
        System.out.println("Enter the Department name:");
        String dname=sc.next();
        System.out.println("Enter the student id:");
        int sid=sc.nextInt();
        System.out.println("Enter the student name:");
        String sname=sc.next();
        Student student=new Student();
        Department department=new Department();
        department.setDname(dname);
        department.setDid(did);
        student.setDepartment(department);
        student.setDepartment(department);
        student.setSid(sid);
        student.setSname(sname);
        return student;
    }
    public static void main(String[] args)
    {
        Student student=createStudent();
        System.out.println("Department id:"+student.getDepartment().getDid());
        System.out.println("Department name:"+student.getDepartment().getDname());
        System.out.println("Student id:"+student.getSid());
        System.out.println("Student name:"+student.getSname());
    }
}