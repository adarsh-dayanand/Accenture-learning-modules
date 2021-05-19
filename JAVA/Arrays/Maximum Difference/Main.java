import java.util.*;

public class Main{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        sc.nextLine();
        if(num<=0){
            System.out.println("Invalid");
            return;
        }
        int input[]=new int[num];
        for(int i=0;i<num;i++){
            input[i]=sc.nextInt();
            sc.nextLine();
        }
        for(int i:input)
            if(i<0){
                System.out.println("Invalid");
                return;
            }
            int diff[][]=new int[num][num];
            for(int i=0;i<num;i++){
                for(int j=0;j<num;j++){
                    diff[i][j]=Math.abs(input[i]-input[j]);
                }
            }
            
            int max=Integer.MIN_VALUE;
            for(int i=0;i<num;i++){
                for(int j=0;j<num;j++){
                    if(diff[i][j]>max)
                        max=diff[i][j];
                }
            }
            
            for(int i=0;i<num;i++){
                for(int j=0;j<num;j++){
                    if(diff[i][j]==max){
                        System.out.println("("+(i)+","+(j)+")");
                        return;
                    }
                }
            }
    }
}















