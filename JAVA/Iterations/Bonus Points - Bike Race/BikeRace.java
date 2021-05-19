import java.util.Scanner;
public class BikeRace
{
    public static void main (String[] args) {
        int pdevn=1, pdodd=1,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance travelled");
        int dist=sc.nextInt();
        if(dist<0)
        {
            System.out.println("Invalid Input");
        }
        else if(dist==0)
        {
            System.out.println("Your bonus points is 0");
        }
        else
        {
            while(dist>0)
            {
                r=dist%10;
                pdevn*=r;
                dist/=10;
                if(dist>0)
                {
                    r=dist%10;
                    pdodd*=r;
                    dist/=10;
                }
            }
            
            if(pdevn==pdodd)
            {
                System.out.println("Your bonus points is "+(pdevn*2));
            }
            
            else if(pdevn>pdodd)
            {
                System.out.println("Your bonus points is "+(pdevn));
            }
            
            else
            {
                System.out.println("Your bonus points is "+(pdodd));
            }
        }
    }
}