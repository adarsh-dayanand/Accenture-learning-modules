import java.util.*;

class Node 
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

public class DeleteMain 
{Node head;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        DeleteMain obj = new DeleteMain();
        
        int n = sc.nextInt();
        
        if(n>0)
            {
                sc.nextLine();
                
                String[] in = (sc.nextLine().split(" "));
                
                for(int i=0; i<n; i++)
                {
                    obj.add(Integer.parseInt(in[i]));
                }
                
                System.out.println("Enter the element to be deleted: ");
                int key=sc.nextInt();
                
                obj.delete(key);
                
                System.out.print("The list after deletion: ");
                obj.display();
            }
    }
    
    public void add(int data)
    {
        Node newNode = new Node(data);
        Node current = head;
        if(head == null)
        {
            head = newNode;
            return;
        }
        else
        {
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = newNode;
            return;
        }
    }
    
    public void delete(int key)
    {
        Node temp = head, prev = null;
        while(temp != null && temp.data == key)
        {
            head = temp.next;
            temp = head;
        }
        
        while(temp != null)
        {
            while(temp != null && temp.data != key)
            {
                prev = temp;
                temp = temp.next;
                
            }
        
        
            if(temp == null)
            {
                return;
            }
            
            
            prev.next = temp.next;
            temp = prev.next;
        }
    }
    
    public void display()
    {
        Node temp=head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    
}