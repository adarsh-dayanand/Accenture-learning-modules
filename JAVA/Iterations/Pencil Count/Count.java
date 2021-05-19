import java.util.Scanner;
public class Count 
{
    public static void main (String[] args) {
        int penc=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the standard");
        int stan=sc.nextInt();
        if(stan<1||stan>12)
        {
            System.out.println("Invalid Standard");
        }
        else
        {
            for(int i=1;i<=stan;i++)
            {
                penc+=i*i;
            }
            System.out.println("Nila gets "+penc+" pencils");
        }
    }
}