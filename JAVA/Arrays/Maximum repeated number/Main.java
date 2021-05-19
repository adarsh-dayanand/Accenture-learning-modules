import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
    
        int max=0,count=0,tmpcount=0,size;
        
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        sc.nextLine();
        if(size<=0){
            System.exit(0);
        }
        int[] a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
            sc.nextLine();
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(a[i]==a[j]){
                    tmpcount++;
                }
            }
            if(tmpcount>=count){
                if(a[i]<max&&tmpcount==count){
                    count=tmpcount;
                }else{
                    max=a[i];
                    count=tmpcount;
                }
            }
            tmpcount=0;
        }
        System.out.println(max);
       
    }
}