public class Employee{
    
    private int employeeId;
    private String employeeName;
    private double salary;
    private double netSalary;
    
    /***** Getters **********/
    public int getEmployeeId()
    {
        return employeeId;
    }
    public String getEmployeeName()
    {
        return employeeName;
    }
    public double getSalary()
    {
        return salary;
    }
    public double getNetSalary()
    {
        return netSalary;
    }
    
    /******* Setters ***********/
    public void setEmployeeId(int employeeId)
    {
        this.employeeId = employeeId;
    }
    public void setEmployeeName(String employeeName)
    {
        this.employeeName = employeeName;
    }
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    public void setNetSalary(double netSalary)
    {
        this.netSalary = netSalary;
    }
    
    public void calculateNetSalary(int pfpercentage)
    {
        double pfamount;
        pfamount = salary * pfpercentage/100;
        netSalary = salary - pfamount;
    }
}