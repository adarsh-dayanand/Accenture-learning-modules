//import the necessary packages if needed
import java.util.*;   
@SuppressWarnings("unchecked")//Do not delete this line
public class UniqueWords
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student's Article");
        String s=sc.nextLine();
        s=s.toLowerCase();
        int len=s.length();
        StringBuilder sb=new StringBuilder(s);
        for(int a=0;a<sb.length();a++)
        {
            if(!(Character.isLetter(sb.charAt(a))))
            {
                if(sb.charAt(a)!=' ')
                {
                    if(sb.charAt(a)!='\'')
                    sb.deleteCharAt(a);
                }
            }
        }
        s=sb.toString();
        String str[]=s.split(" ");
        Set<String> s1=new HashSet<String>
        (Arrays.asList(str));
        List<String> s2=new ArrayList<String>(s1);
        System.out.println("Number of words "+str.length);
        System.out.println("Number of unique words "+s1.size());
        Collections.sort(s2);
        int a=1;
        System.out.println("The words are");
        for(String stemp:s2)
        {
            System.out.println((a++)+". "+stemp);
        }
    }
}