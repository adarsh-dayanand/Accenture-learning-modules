import java.util.*;
public class OccurrenceOfChar{
    public static void main (String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word:");
        String word=sc.nextLine();
        if(word.matches("^[a-zA-Z]*$")){
            System.out.println("Enter the character:");
            char ch=sc.next().charAt(0);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                for(int i=0;i<word.length();i++){
                    if(word.charAt(i)==ch)
                        count++;
                }
                if(count<=0)
                    System.out.println("The given character '"+ch+"' not present in the given word.");
                else
                    System.out.println("No of '"+ch+"' present in the given word is "+count+".");
            }else
                System.out.println("Given character is not an alphabet");
        }else
            System.out.println("Not a valid string");
    }
}