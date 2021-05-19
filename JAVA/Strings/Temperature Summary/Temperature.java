import java.util.*;

public class Temperature{
    public static void main (String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        String str=sc.nextLine();
        String[] t=str.split("\\s");
        int temp[]=new int[t.length];
        
        for(int i=0;i<15;i++)
            temp[i]=Integer.parseInt(t[i]);
            
        boolean c=false,d=false,w=false;
        for(int i=0;i<15;i++)
            if(temp[i]<=20)
                c=true;
            else if(temp[i]>20 && temp[i]<=30)
                w=true;
            else if(temp[i]>30)
                d=true;
            if(d){
                System.out.println("Dry Temperature");
                for(int i=0;i<15;i++)
                    if(temp[i]>30)
                        System.out.print((i+1)+" ");
                        System.out.println();
                        for(int i:temp)
                            if(i>30)
                                System.out.print(i+" ");
                                System.out.println();
            }
            if(w){
                System.out.println("Warm Temperature");
                for(int i=0;i<15;i++)
                    if(temp[i]>20 && temp[i]<=30)
                        System.out.print((i+1)+" ");
                        System.out.println();
                        for(int i:temp)
                            if(i>20 && i<=30)
                                System.out.print(i+" ");
                                System.out.println();
            }
            if(c){
                System.out.println("Cool Temperature");
                for(int i=0;i<15;i++)
                    if(temp[i]<=20)
                        System.out.print((i+1)+" ");
                        System.out.println();
                        for(int i:temp)
                            if(i<=20)
                                System.out.print(i+" ");
                                System.out.println();
            }
    }
}