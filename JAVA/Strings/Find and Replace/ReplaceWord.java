import java.util.*;

public class ReplaceWord{
    public static void main (String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        System.out.println("Enter the word to be searched:");
        String key=sc.nextLine();
        System.out.println("Enter the word to be replaced:");
        String rep=sc.nextLine();
        if(str.contains(key)==true){
            str=str.replace(key,rep);
            System.out.println(str);
        }
        else{
            System.out.println("The word "+key+" not found");
        }
    }
}