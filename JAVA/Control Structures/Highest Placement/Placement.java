import java.util.Scanner;
public class Placement
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of students placed in CSE:");
            int CSE= sc.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
            int ECE=sc.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
            int MECH=sc.nextInt();
            
        if(CSE<0||ECE<0||MECH<0)
        {
            System.out.println("Input is Invalid");
        }
        
        else if(CSE==ECE && ECE==MECH)
        {
            System.out.println("None of the department has got the highest placement");
        }
        
        else if(CSE==ECE && MECH<CSE)
        {
            System.out.println("Highest placement");
            System.out.println("CSE");
            System.out.println("ECE");
        }
        
        else if(CSE==MECH && ECE<MECH)
        {
            System.out.println("Highest placement");
            System.out.println("CSE");
            System.out.println("MECH");
        }
        
        else if(ECE==MECH && CSE<MECH)
        {
            System.out.println("Highest placement");
            System.out.println("ECE");
            System.out.println("MECH");
        }
        
        else if(CSE>ECE&&CSE>MECH)
        {
            System.out.println("Highest placement");
            System.out.println("CSE");
        }
        
        else if(ECE>CSE && ECE>MECH)
        {
            System.out.println("Highest placement");
            System.out.println("ECE");
        }
        
        else if(MECH>CSE&&MECH>ECE)
        {
            System.out.println("Highest placement");
            System.out.println("MECH");
        }
    }
}