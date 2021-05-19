import java.util.*;
public class ValidateUtility
{
    public static void main(String args[])
    {
        //fill code here
        Scanner sc=new Scanner(System.in);
        String empname=sc.nextLine();
        String productname=sc.nextLine();
        Validate v1=validateEmployeeName();
        if(v1.validateName(empname))
            System.out.println("Employee name is valid");
        else
            System.out.println("Employee name is invalid");
        Validate v2=validateProductName();
        if(v2.validateName(productname))
            System.out.println("Product name is valid");
        else
            System.out.println("Product name is invalid");
    }
    
    public static Validate validateEmployeeName() 
    {
        Validate val=null;
        val=(name)->
        {
            int count=0;
            for(int i=0;i<name.length();i++)
            {
                if(Character.isLetter(name.charAt(i)) || name.charAt(i)==' ')
                    count++;
            }
            if(count==name.length()&&(count>=5 && count<=20))
                return true;
            else
                return false;
        };
        return val;
    }
    
    public static Validate validateProductName() 
    {
        Validate val=null;
        val=(name)->
        {
            int count=0;
            if(name.length()!=6)
                return false;
            else
            {
                for(int i=0;i<name.length();i++)
                {
                    if(i==0 && Character.isLetter(name.charAt(0)))
                        count++;
                    else
                    {
                        if(i!=0 && name.charAt(i)>='0'&& name.charAt(i)<='9')
                            count++;
                    }
                }
                if(count==6)
                    return true;
                else
                    return false;
            }
        };
        return val;
    }
}