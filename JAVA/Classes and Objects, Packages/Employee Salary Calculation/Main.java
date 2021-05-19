import java.util.*;

public class Main{
    public static Employee getEmployeeDetails() {
        
        Scanner sc = new Scanner(System.in);
        
        Employee emp = new Employee();
        
        System.out.println("Enter Id:");
        int id = sc.nextInt();
        emp.setEmployeeId(id);
        System.out.println("Enter Name:");
        String name = sc.next();
        emp.setEmployeeName(name);
        System.out.println("Enter salary:");
        double salary = sc.nextDouble();
        emp.setSalary(salary);
        return emp;
    }
    
    public static int getPFPercentage()
    {
        Scanner sc_1 = new Scanner(System.in);
        
        System.out.println("Enter PF percentage:");
        int pfper = sc_1.nextInt();
        return pfper;
    }
    
    public static void main(String[] args)
    {
        Employee emp1;
        emp1 = Main.getEmployeeDetails();
        int pf = Main.getPFPercentage();
        emp1.calculateNetSalary(pf);
        
        System.out.println("Id : "+emp1.getEmployeeId());
        System.out.println("Name : "+emp1.getEmployeeName());
        System.out.println("Salary : "+emp1.getSalary());
        System.out.println("Net Salary : "+emp1.getNetSalary());
    }
}