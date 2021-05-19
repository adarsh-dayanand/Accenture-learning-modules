import java.util.Stack;
import java.util.Scanner;
class StackDriver
{ static Stack<Integer>st=new Stack<>();
  static void insert_at_bottom(int x)
  { if(st.isEmpty())
       st.push(x);
    else
    {  int a= st.peek();
       st.pop();
       insert_at_bottom(x);
       st.push(a);
    }
}
static void reverse()
{ if(st.size()>0)
  { int x= st.peek();
    st.pop();
    reverse();
    insert_at_bottom(x);
  }
}
public static void main(String[] args)
{ Scanner s=new Scanner(System.in);
  System.out.println("Enter length of List:");
  int n=s.nextInt();
  if(n==0||n<0)
  { System.out.println("Invalid Length");}
  else
    {for(int i=1;i<=n;i++)
        { st.push(i);}
          System.out.println("Elements in Stack ");
          System.out.println(st);
          reverse();
          System.out.println("Elements in the stack after reversal");
          System.out.println(st);}
}
}
  