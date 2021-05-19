import java.util.*;
public class AsciValue{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digits:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int n4=sc.nextInt();
        char c1=(char)n1;
        char c2=(char)n2;
        char c3=(char)n3;
        char c4=(char)n4;
        System.out.print("\n"+n1+"-"+c1);
        System.out.print("\n"+n2+"-"+c2);
        System.out.print("\n"+n3+"-"+c3);
        System.out.print("\n"+n4+"-"+c4);
    }
}