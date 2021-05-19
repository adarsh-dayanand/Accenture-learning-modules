public class Student 
{
    private int id;
    private String name;
    private int[] marks;
    private float average;
    private char grade;
    
    public void setId(int id)
    {
        this.id=id;
    }
    
    public int getId()
    {
        return this.id;
    }
    
    public void setName(String name)
    {
        this.name=name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setMarks(int[] marks)
    {
        this.marks=marks;
    }
    
    public int[] getMarks()
    {
        return this.marks;
    }
    
    public void calculateAvg()
    {   float sum=0;
        
        for(int i=0;i<this.marks.length;i++)
        {
            sum+=this.marks[i];
        }
        
        average=(float)(sum/(this.marks.length));
        setAverage(average);
    }
    
    public void findGrade()
    {int flag=0;
        for(int i=0;i<this.marks.length;i++)
        {
            if(this.marks[i]<50)
            {
                flag++;
            }
        }
        if(flag>0)
        {
            grade='F';
        }
        else
        {
            if(this.average>=80 && this.average<=100)
            {
                grade='O';
            }
            else if(this.average>=50 && this.average<=79)
            {
                grade='A';
            }
            else
            {
                grade='F';
            }
        }
        setGrade(grade);
        
    }
    
    public void setAverage(float average)
    {
        this.average=average;
    }
    
    public void setGrade(char grade)
    {
        this.grade=grade;
    }
    
    public float getAverage()
    {
        return this.average;
    }
    
    public char getGrade()
    {
        return this.grade;
    }
}