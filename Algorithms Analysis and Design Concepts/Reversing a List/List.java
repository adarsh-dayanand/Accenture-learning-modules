import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

public class List 
{static Node head;
    public static void main (String[] args) {
        Scanner sc=new Scanner (System.in);
        List obj = new List();
        
        
            do{
            
                System.out.println("Enter the value:");
                int val=sc.nextInt();
                sc.nextLine();
                obj.append(val);
                System.out.println("Do you want to add another node? Type Yes/No");
            
            }while(sc.nextLine().equalsIgnoreCase("yes"));
        
        System.out.print("The elements in the linked list are: ");
        obj.display();
        obj.Reverse();
        System.out.println();
        System.out.print("The elements in the reversed linked list are : ");
        obj.display();
        
    }
    
    public void append(int data)
    {
        
        Node newNode= new Node(data);
        Node current = head;
        if(head == null)
        {
            head = newNode;
            return;
        }
        else
        {
            while(current.next!=null)
            {
                current = current.next;
            }
            current.next=newNode;
            return;
        }
    }
    
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    
    public Node Reverse()
    {
        Node prev=null;
        Node current=head;
        Node next=null;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
        return head;
        
    }
}