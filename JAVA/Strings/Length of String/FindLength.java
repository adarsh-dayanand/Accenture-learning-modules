import java.util.*;

class FindLength{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(str.matches("^[a-zA-Z ]*$")){
            System.out.println("No of characters is:"+str.length());
        }
        else{
            System.out.println("Invalid String");
        }
    }
}