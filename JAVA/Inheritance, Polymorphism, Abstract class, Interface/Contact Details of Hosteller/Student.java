public class Student
{
    protected int studentId;
    protected String name;
    protected int departmentId;
    protected String gender;
    protected String phone;
    public void setStudentId(int a)
    {
        studentId=1;
    }
    public void setName(String b)
    {
        name=b;
        
    }
    public void setDepartmentId(int c)
    {
        departmentId=c;
    }
    public void setGender(String e)
    {
        gender=e;
    }
    public void setPhone(String f)
    {
        phone=f;
    }
    public int getStudentId()
    {
        return studentId;
    }
    public int getDepartmentId()
    {
        return departmentId;
    }
    public String getName()
    {
        return name;
    }
    public String getGender()
    {
        return gender;
    }
    public String getPhone()
    {
        return phone;
    }
}