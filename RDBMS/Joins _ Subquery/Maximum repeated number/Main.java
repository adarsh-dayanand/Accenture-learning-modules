import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n<=0){
        System.out.println("Invalid Input");
    }
    else{
        int[] a=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        String t="";
        int[] b=new int[20000];
        int idx=1;
        int[] temp=new int[n];
        for(int i=0;i<n;i++)
            temp[i]=a[i];
            for(int i=0;i<n;i++)
                b[a[i]+10000]++;
                int max=1;
                int k=0;
                for(int i=0;i<20000;i++){
                    if(b[i]!=0){
                        if(b[i]>max){
                            max=b[i];
                        }
                    }
                }
                    int[] maxi=new int[n];
                    for(int i=0;i<20000;i++){
                        if(b[i]==max){
                            maxi[k++]=(i-10000);
                        }
                    }
                    max=maxi[0];
                    for(int i=0;i<k;i++){
                        if(max<=maxi[i]){
                            max=maxi[i];
                        }
                    }
                    System.out.println(max);
    }
    
    }
}