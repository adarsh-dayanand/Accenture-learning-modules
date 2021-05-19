public class Driver
{
public static void main(String[] args)
{
//create a object for Doctor, set the name and specialization, invoke the method and print the result
Doctor dr=new Doctor();
dr.name="vaibhav";
dr.specializationType="Cardiologist";
System.out.println(dr.displayDetails());
}


}