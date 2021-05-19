import java.util.Scanner;
import java.lang.*;
class SortDriver{
public final static int MAX =100;
public static String alternateSort(String s1)
{
int n= s1.length();
char [] s = s1.toCharArray();
int[] lCount = new int [MAX];
int[] uCount = new int [MAX];
for (int i=0;i<n;i++)
{
if(Character.isUpperCase(s[i]))
uCount[s[i] - 'A']++;
else
lCount[s[i] - 'a']++;
}
int i=0,j=0,k=0;
 while(k<n)
{
  while(i<MAX && uCount[i] ==0)
 i++;
  if(i<MAX)
  {
  s[k++]= (char)('A'+i);
    uCount[i]--;
  }
 while(j<MAX && lCount[j]==0)
 j++;
 if(j<MAX)
  {
   s[k++]= (char)('a'+j);
   lCount[j]--;
    }
   }
  return(new String(s));
  }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      System.out.println("Enter the String:");
     String str;
        str =input.nextLine();
     System.out.println("the Sorted String is:");
        System.out.println(alternateSort(str));
      }
    }