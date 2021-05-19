import java.util.*;

public class Main{
    public static void main(String[] args){
        
        int size;
        Scanner sc = new Scanner(System.in);
        size=sc.nextInt();
        sc.nextLine();
        String[] country_name=new String[size];
        int pop[]=new int[size];
        
        for(int i=0;i<size;i++)
            country_name[i]=sc.nextLine();
        for(int i=0;i<size;i++)
        {
            pop[i]=sc.nextInt();
            sc.nextLine();
        }
        
        int temp[]=Arrays.copyOf(pop,size);
        Arrays.sort(pop);
        
        for(int i=0;i<size;i++)
            for(int j=0;j<size;j++)
                if(temp[j]==pop[i])
                    System.out.println(country_name[j]);
        
        for(int i:pop)
            System.out.println(i);
    }
}