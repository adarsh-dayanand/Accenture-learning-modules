import java.util.*;

public class Main{
    public static void main (String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the shape :");
        String shape=sc.nextLine();
        if(shape.equalsIgnoreCase("Circle")){
            System.out.println("Enter the radius :");
            float r=sc.nextFloat();
            Circle c=new Circle(r);
            System.out.println("The area of Circle is : "+String.format("%.2f",c.calculateArea()));
        }
        else if(shape.equalsIgnoreCase("Rectangle")){
            System.out.println("Enter the length :");
            float l=sc.nextFloat();
            System.out.println("Enter the breadth :");
            float b=sc.nextFloat();
            Rectangle r=new Rectangle(l,b);
            System.out.println("The area of Rectangle is : "+String.format("%.2f",r.calculateArea()));
        }
        else if(shape.equalsIgnoreCase("Triangle")){
            System.out.println("Enter the base :");
            float b=sc.nextFloat();
            System.out.println("Enter the height :");
            float h=sc.nextFloat();
            Triangle t=new Triangle(b,h);
            System.out.println("The area of Triangle is : "+String.format("%.2f",t.calculateArea()));
        }
    }
}