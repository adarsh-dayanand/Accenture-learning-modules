import java.util.*;
public class Numerology 
{
    char[][] num_val={{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H','I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'},
                    {1, 2, 3, 4, 5, 8, 3, 5, 1, 1, 2, 3, 4, 5, 7, 8, 1, 2, 3, 4, 6, 6, 6, 5, 1, 7}};
                    
    public char numerological_value(char chr)
    {
        for(int i=0;i<26;i++)
        {
            if(chr==(num_val[0][i]))
            {
                return num_val[1][i];
            }
        }
        return 0;
    }
    
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        Numerology obj=new Numerology();
        
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        
        int len=name.length();
        int flag=0, val=0;
        
        for(int i=0; i<len;i++)
        {  
            
            char r=name.charAt(i);
            int temp=(obj.numerological_value(r));
            if(temp==0)
            {
                System.out.println("Invalid name");
                flag++;
                break;
            }
            else
            {
                val+=(int)temp;
            }
        }
        if(flag==0)
        {
            System.out.println("Your numerology no is:"+val);
        }
    }
}