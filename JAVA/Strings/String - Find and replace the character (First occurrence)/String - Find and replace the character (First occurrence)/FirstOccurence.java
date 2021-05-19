import java.util.*;
public class FirstOccurence 
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        char[] str=sc.nextLine().toCharArray();
        
        System.out.println("Enter the character to be searched:");
        char srch=sc.next().charAt(0);
        
        System.out.println("Enter the character to replace:");
        char replace=sc.next().charAt(0);
        
        int flag=0;
        int len=str.length;
        for(int i=0;i<len;i++)
        {char r=str[i];
            if(r==srch)
            {
                str[i]=replace;
                flag++;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("character not found");
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