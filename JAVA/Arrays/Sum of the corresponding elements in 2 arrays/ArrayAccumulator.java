import java.util.*;

class ArrayAccumulator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of first array:");
        int n=sc.nextInt();
        if(n<=0){
            System.out.println("Invalid array size");
        }
        else{
            int[] a=new int[n];
            System.out.println("Enter elements for first array:");
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            System.out.println("Enter the size of second array:");
            int n1=sc.nextInt();
            if(n1<=0){
                System.out.println("Invalid array size");
            }
            else{
                int[] a1=new int[n1];
                System.out.println("Enter elements for second array:");
                for(int i=0;i<n1;i++){
                    a1[i]=sc.nextInt();
                }
                int a2;
                if(n==n1){
                    for(int i=0;i<n;i++)
                        System.out.println(a[i]+a1[i]);
                }
                else if(n>n1){
                    for(int i=0;i<n1;i++)
                        System.out.println(a[i]+a1[i]);
                    for(int i=n1;i<n;i++)
                        System.out.println(a[i]);
                }
                else if(n<n1){
                    for(int i=0;i<n;i++)
                        System.out.println(a[i]+a1[i]);
                    for(int i=n;i<n1;i++)
                        System.out.println(a1[i]);
                }
            }
        }
    }
}