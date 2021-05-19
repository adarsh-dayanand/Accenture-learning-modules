import java.util.*;
class UniqueChar{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String str=sc.nextLine();
        int flag=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLetter(ch)||ch==' ')
                continue;
            System.out.println("Invalid Sentence");
            return;
        }
        int count[]=new int[256];
        int i;
        for(i=0;i<str.length();i++){
            if(str.charAt(i)!=' ')
                count[(int)str.charAt(i)]++;
        }
        int n=i;
        for(i=0;i<n;i++){
            if(count[(int)str.charAt(i)]==1)
                flag=1;
        }
        if(flag==1){
            System.out.println("Unique characters:");
            for(i=0;i<n;i++)
                if(count[(int)str.charAt(i)]==1)
                    System.out.println(str.charAt(i));
        }else
            System.out.println("No unique characters");
    }
}