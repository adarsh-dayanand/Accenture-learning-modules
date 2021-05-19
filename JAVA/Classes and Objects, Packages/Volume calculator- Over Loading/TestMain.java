import java.util.*;

public class TestMain{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        VolumeCalculator vc = new VolumeCalculator();
        System.out.println("Enter the choice");
        System.out.println("1.Find Volume For Cylinder");
        System.out.println("2.Find Volume For Cuboid");
        int ch=sc.nextInt();
        
        if(ch==1)
        {
            System.out.println("Enter the radius");
            double r=sc.nextDouble();
            System.out.println("Enter the height");
            double h=sc.nextDouble();
            double result=vc.calculateVolume(r,h);
            System.out.println("Volume of the Cylinder is "+result);
        }
        else if(ch==2)
        {
            System.out.println("Enter the length");
            int length=sc.nextInt();
            System.out.println("Enter the breadth");
            int breadth=sc.nextInt();
            System.out.println("Enter the height");
            int height=sc.nextInt();
            double rs=vc.calculateVolume(length,breadth,height);
            System.out.println("Volume of the Cuboid is "+rs);
        }
    }
}