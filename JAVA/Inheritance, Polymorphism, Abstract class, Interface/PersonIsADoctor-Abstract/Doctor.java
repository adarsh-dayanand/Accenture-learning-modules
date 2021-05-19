public class Doctor extends Person // inherit name from Person in Doctor class
{
//inlcude the required attribute and method as per the problem statement
String specializationType;

public String displayDetails()
{
    return (name+" is a "+specializationType);
}

}