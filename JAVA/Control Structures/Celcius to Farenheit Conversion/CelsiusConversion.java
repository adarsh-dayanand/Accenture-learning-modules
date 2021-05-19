import java.util.Scanner;
public class CelsiusConversion
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        double cel=sc.nextDouble();
        double fah=((9*cel)/5)+32;
        System.out.println(fah);
    }
}