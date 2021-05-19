import java.util.*;
public class Factorial{
    public static void main (String[] args) {
        
        int size;
        System.out.println("Enter the size of an array:");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        if(size<=0){
            System.out.println("Invalid array size");
            return ;
        }
        System.out.println("Enter the elements:");
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        array[i]=sc.nextInt();
        boolean isValid=false;
        for(int i=0;i<size;i++){
            if(array[i]>0&&array[i]<10){
                int sum=1;
                isValid=true;
                while(array[i]>0){
                    sum=sum*array[i];
                    array[i]=array[i]-1;
                }
                array[i]=sum;
            }else
            array[i]=0;
        }
        int sum=0;
        for(int i:array)
        sum+=i;
        if(isValid)
        System.out.println(sum);
        else
        System.out.println("No positive and single digit numbers found in an array");
    }
}