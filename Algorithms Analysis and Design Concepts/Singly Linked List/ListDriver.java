import java.util.Scanner;
public class ListDriver
{ class Node { int data;
               Node next;
    public Node(int data)
    { this.data=data;
      this.next=null;
    }
}
public int size;
public Node head= null;
public Node tail=null;
public void addNode(int data)
{ Node newNode=new Node(data);
if(head==null)
{ head = newNode;
tail=newNode;
}
else{tail.next=newNode;
        tail =newNode;
    }
size++;
}
public Node reverseList(Node temp)
{ Node current=temp;
  Node prevNode=null, nextNode=null;
  while(current!=null)
  {nextNode=current.next;
  current.next=prevNode;
  prevNode=current;
  current=nextNode;
  }
  return prevNode;
}
public void isPalindrome()
{ Node current= head;
boolean flag=true;
int mid=(size%2==0)?(size/2):((size+1)/2);
for(int i=1;i<mid;i++)
{current=current.next;
}
Node revHead= reverseList(current.next);
while (head!= null&& revHead!= null)
{ if(head.data!=revHead.data)
{ flag=false;
break;
}
head=head.next;
revHead=revHead.next;
}
if(flag)
System.out.println("1");
else
System.out.println("0");
}
public void display()
{ Node current=head;
if(head==null)
    { return;
    }
while(current!=null)
{ 
 current=current.next;
}
System.out.println();
}

public static void main(String[] args)
{ ListDriver sList=new ListDriver();
  Scanner s= new Scanner(System.in);
  int n;
  n=s.nextInt();
  do{sList.addNode(s.nextInt());
     n--;
  } while(n>=1);
  
  sList.display();
  sList.isPalindrome();
}
}
 