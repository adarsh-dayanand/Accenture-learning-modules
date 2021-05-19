import java.util.*;
import java.text.*;
public class Main 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
String join = sc.next();
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
try 
{ sdf.setLenient(false); 
Date d1 = sdf.parse(join); 
Date d2 = new Date(); 
long diff = d2.getTime() - d1.getTime(); 
long l1 = (24*60*60*1000); 
long l = l1*365; 
long year=diff/l; 
System.out.println(year+" years"); 
} 
catch(ParseException e) {} 
}
    
}