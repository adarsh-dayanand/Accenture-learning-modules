import java.util.*;

public class Main{
    public static void main (String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] input=str.split("\\s");
        String[] rev=Arrays.copyOf(input,input.length);
        
        for(int i=0;i<input.length;i++){
            StringBuffer r= new StringBuffer(rev[i]);
            r=r.reverse();
            rev[i]=r.toString();
        }
        
        for(String i:rev)
            System.out.print(i+" ");
        System.out.println();
        
        for(int i=0;i<input.length;i++){
            input[i]=input[i].toLowerCase();
            rev[i]=rev[i].toLowerCase();
        }
        boolean isValid=true;
        
        for(int i=0;i<input.length;i++){
            if(rev[i].equals(input[i]) && input[i].length()>1){
                System.out.println(input[i]);
                isValid=false;
            }
        }
        
        if(isValid)
            System.out.println("No palindrome");
    }
}