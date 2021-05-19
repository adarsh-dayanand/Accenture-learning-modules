import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the four sticks in cm");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int n4=sc.nextInt();
        System.out.println("Enter one internal angle");
        int angle=sc.nextInt();
        int p=(n1*n1+n2*n2);
        int q=n2*n2+n3*n3;
        int r=n3*n3+n4*n4;
        int s=n4*n4+n1*n1;
        if(n1==n2 && n1==n3 && n1==n4){
            if(angle==90){
                System.out.println("It's a square");
            }
            else if(angle!=90){
                System.out.println("It's a rhombus");
            }
            else{
                System.out.println("It's a irregular quadrilateral");
            }
        }
        else if(n1==n2 && n3==n4 ||n1==n3 && n4==n2){
            if(angle==90){
                System.out.println("It's a rectangle");
            }
            else if(angle!=90 && p!=q || q!=r || r!=s || s!=p){
                System.out.println("It's a parallelogram");
            }
            else{
                System.out.println("It's a irregular quadrilateral");
            }
        }
        else{
            System.out.println("It's a irregular quadrilateral");
        }
    }
}