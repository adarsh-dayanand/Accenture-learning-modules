import java.util.*;

class Main{
    public static void main (String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the letter");
        char check=sc.next().toUpperCase().charAt(0);
        sc.nextLine();
        String str=sc.nextLine();
        String s[]=str.split(" ");
        int sum=2;
        boolean isInvalid=false;
        if(s.length<3){
            isInvalid=true;
        }else{
            for(int i=0;i<s.length;i++){
                char c=s[i].toUpperCase().charAt(0);
                if(i<3){
                    if(c!=check){
                        isInvalid=true;
                        break;
                    }
                }else{
                    if(c==check){
                        sum+=2;
                    }else{
                        isInvalid=true;
                        break;
                    }
                }
            }
        }
        if(isInvalid){
            System.out.println("No score");
            return;
        }
        System.out.println("Good,You get a score of "+sum);
    }
}