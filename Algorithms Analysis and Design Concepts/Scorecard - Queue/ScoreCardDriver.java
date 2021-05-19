import java.util.*;

class ScoreCardDriver
{
    final static int MaxQ=100;
    int front = 0, rear = 0;
    int[] QA = new int[MaxQ];
    
    public boolean empty()
        {
            return front == rear;
        }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ScoreCardDriver obj = new ScoreCardDriver();
        
        System.out.print("Enter the size of the score card:");
        int n=sc.nextInt();
        if(n>0 && n<=100)
            {
                int[] in = new int[n];
                for(int i=0; i<n; i++)
                    {
                        System.out.print("Enter the hurdle race score "+(i+1)+":");
                        obj.enQueue(sc.nextInt());
                        System.out.println();
                    }
                    System.out.print("Latest hurdle race scores are: ");
                    obj.display();
            }
        else
            {
                System.out.println("Invalid score card size");
            }
            
            
    }
    
    public void enQueue(int n)
        {
            /*if(rear != front)
            {
                return;
            }*/
            if((rear-front) == 5)
            {
                deQueue();
            }
                QA[rear] = n;
                rear++;
                return;
        }
    
    public void deQueue()
        {
            if(this.empty())
            {
                return;
            }
            front++;
        }
    
    public void display()
        {
            for(int i=front; i<rear ;i++)
                {
                    System.out.print(QA[i]+" ");
                }
        }
}