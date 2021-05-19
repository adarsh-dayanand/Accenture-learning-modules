import java.util.*;
public class InitCap
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the String:");
        char[] str=sc.nextLine().toCharArray();
        int upps=0,word=0;
        /*if(Character.isUpperCase(str[0]))
        {
            upps++;
        }*/
        
        int len=str.length;
        for(int i=0;i<len;i++)
        {
            if(i==0 || Character.isWhitespace(str[i-1]))
            {word++;
            
                if(Character.isLowerCase(str[i]))
                {
                    str[i]=Character.toUpperCase(str[i]);
                }
                else
                {
                    upps++;
                }
            }
        }
        
        if(word==upps)
        {
            System.out.println("First character of each word is already in uppercase");
        }
        
        else
        {
            for(char i : str)
            {
                System.out.print(i);
            }
        }
        
        
    }
}