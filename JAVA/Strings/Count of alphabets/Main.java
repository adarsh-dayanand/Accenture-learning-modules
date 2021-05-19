import java.util.*;
public class Main    
{    
    public static void main(String[] args) {  
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();   
        int count = 0;    
            
        //Counts each character except space    
        for(int i = 0; i < str.length(); i++) {    
            if(Character.isAlphabetic(str.charAt(i))==true)    
                count++;    
        }    
            
        //Displays the total number of characters present in the given string    
        System.out.println(count);    
    }    
}     