// TODO - Implement the Project and Internal_Project classes as per specification here
import java.util.*;
public class Company 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		//Implement the code here
		InternalProject ip=new InternalProject();
		System.out.println("Enter the Project Id");
		ip.setProjectId(s.nextLine());
		System.out.println("Enter the Project Name");
		ip.setProjectName(s.nextLine());
		System.out.println("Enter the Department Code");
		ip.setDeptCode(s.nextLine());
		System.out.println("Enter the Number of allocated resource");
		ip.setNoOfResource(s.nextInt());
		s.nextLine();
		System.out.println("Enter the cost per resource");
		ip.setCostPerResource(s.nextFloat());
		ip.calculateCostDetails();
		System.out.println("Calculated Cost of Project "+ip.getProjectId()+","+ip.getProjectName()+" for Department "+ip.getDeptCode()+" : "+(int)ip.getProjectCost());
	}

}
