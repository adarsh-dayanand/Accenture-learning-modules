import java.util.Scanner;

public class HighestMarkPerSem{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of semester:");
        int n=sc.nextInt();
        int[] a=new int[n];
        int flag=0;
        for(int i=0;i<n;i++){
            System.out.println("Enter no of subjects in "+(i+1)+" semester:");
            a[i]=sc.nextInt();
        }
        int[] max=new int[n];
        for(int i=0;i<n;i++){
            int mx=0;
            int[] b=new int[a[i]];
            System.out.println("Marks obtained in semester "+(i+1)+":");
            for(int j=0;j<a[i];j++){
                b[j]=sc.nextInt();
                if(b[j]<0 || b[j]>100){
                    flag=1;
                    break;
                }
                if(mx<b[j])
                    mx=b[j];
            }
            if(flag==1){
                break;
            }
            max[i]=mx;
        }
        if(flag==0)
        for(int i=0;i<n;i++){
            System.out.println("Maximum mark in "+(i+1)+" semester:"+max[i]);
        }
        else{
            System.out.println("You have entered invalid mark.");
        }
    }
}