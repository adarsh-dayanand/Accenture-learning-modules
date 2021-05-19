import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
       Vehicle v=new Vehicle("1","as","2 wheeler",15000);
       System.out.println(v.issueLoan());
       System.out.println(v.takeInsurance());
    }
}