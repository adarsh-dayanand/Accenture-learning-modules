import java.util.*;

public class Main{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str;
        str=sc.nextLine();
        char ch[]=str.toCharArray();
        int freq[]=new int[ch.length];
        
        for(int i=0;i<ch.length;i++){
            freq[i]=1;
            for(int j=0;j<ch.length;j++)
                if(ch[i]==ch[j])
                    if(j<i){
                        freq[i]=0;
                        break;
                    }
                    else if(j>i)
                        freq[i]+=1;
        }
        int temp[]=Arrays.copyOf(freq,ch.length);
        Arrays.sort(temp);
        
        int min=1;
        for(int i=0;i<ch.length;i++)
            if(temp[i]>0){
                min=temp[i];
                break;
            }
            for(int i=0;i<ch.length;i++)
                if(min==freq[i])
                    System.out.println(ch[i]);
    }
}

