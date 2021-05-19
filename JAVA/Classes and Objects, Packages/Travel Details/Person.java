public class Person{
    
    private String name;
    private char gender;
    private int age;
    
    /******* Getters ************/
    public String getName()
    {
        return name;
    }
    public char getGender()
    {
        return gender;
    }
    public int getAge()
    {
        return age;
    }
    
    /******** Setters ***********/
    public void setName(String name)
    {
        this.name = name;
    }
    public void setGender(char gender)
    {
        this.gender = gender;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
}