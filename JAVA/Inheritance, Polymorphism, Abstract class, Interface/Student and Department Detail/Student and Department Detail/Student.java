
public class Student
{
    private int sid;
    private String sname;
    private Department department;
    public Department getDepartment()
    {
        return department;
    }
    public int getSid()
    {
        return sid;
    }
    public String getSname()
    {
        return sname;
    }
    public void setSid(int sid)
    {
        this.sid=sid;
    }
    public void setSname(String name)
    {
        sname=name;
    }
    public void setDepartment(Department department)
    {
        this.department=department;
        
    }
}