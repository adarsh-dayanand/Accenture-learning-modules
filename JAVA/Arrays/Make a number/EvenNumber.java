import java.util.*;
import java.lang.*;

class EvenNumber{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size=sc.nextInt();
        
        if(size>0){
            
            int a[] =new int[size];
            ArrayList<Integer> a1 = new ArrayList<Integer>();
            System.out.println("Enter the array elements:");
            for(int i=0;i<size;i++)
            {
                a[i]=sc.nextInt();
                if(a[i]%2==0 && a[i]>=2 && a[i]<=8)
                    a1.add(a[i]);
            }
            if(a1.size()!=0)
            {
                for(int i=0;i<a1.size();i++){
                    System.out.print(a1.get(i));
                }
            }
            else{
                System.out.println("Single digit even number is not found in the array");
            }
        }
        else{
            System.out.println("Invalid array size");
        }
    }
}