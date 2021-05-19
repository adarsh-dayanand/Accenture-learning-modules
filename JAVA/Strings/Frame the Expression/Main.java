import java.util.*;

public class Main{
    public static void main (String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String input;
        input=sc.nextLine();
        String[] exp=input.split("[-+*/=%^!@#$&()_<>]");
        int a=Integer.parseInt(exp[0]);
        int b=Integer.parseInt(exp[1]);
        int result=Integer.parseInt(exp[2]);
        char operator='%';
        
        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);
            if(c=='+' || c=='-' || c=='*' || c=='/'){
                operator=c;
                break;
            }
        }
        boolean isValid=false;
        boolean inValid=false;
        
        switch(operator){
            case '+':
                if((a+b)==result)
                isValid=true;
                break;
            case '-':
                if((a-b)==result)
                isValid=true;
                break;
            case '*':
                if((a*b)==result)
                isValid=true;
                break;
            case '/':
                if((a/b)==result)
                isValid=true;
                break;
            default:
                isValid=true;
                inValid=true;
                break;
        }
        if(isValid){
            if(inValid)
                System.out.println("Invalid Input");
            else
                System.out.println(a+""+operator+""+b+"="+result);
           }else{
               if((a+b)==result)
                operator='+';
               else if((a-b)==result)
                operator='-';
                else if((a*b)==result)
                operator='*';
                else if((a/b)==result)
                operator='/';
                System.out.println(a+""+operator+""+b+"="+result);
           }
    }
}


















