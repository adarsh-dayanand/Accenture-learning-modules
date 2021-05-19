public class Shop{
    private String productName[];
    private int productQuantity[];
    private float productPrice[];
    
    public String[] search(int quantity)
    {
        int c=0;
        int len=productQuantity.length;
            for(int i=0;i<len;i++)
            {
                if(quantity==(productQuantity[i]))
                {
                    c++;
                }
            }
            String[] ans=new String[c];
            for(int i=0,j=0;i<len;i++)
            {
                if(quantity==productQuantity[i])
                {
                ans[j++]=(productName[i]+":"+productPrice[i]);
                }
            }
            return ans;
            
    }
    public String[] search(float price)
    {
        int count=0;
        for(int i=0;i<productPrice.length;i++)
        {
            if(productPrice[i]==price)
            {
                count++;
            }
        }
        String[] ans1=new String[count];
        for(int i=0,j=0;i<productPrice.length;i++)
        {
            if(productPrice[i]==price)
            {
                ans1[j++]=(productName[i]+":"+productQuantity[i]);
            }
        }
        return ans1;
    }
    public String[] search()
    {
        int count=0;
        for(int i=0;i<productQuantity.length;i++)
        {
            if(productQuantity[i]<10)
            {
                count++;
            }
        }
        String ans2[]=new String[count];
        for(int i=0,j=0;i<productQuantity.length;i++)
        {
            if(productQuantity[i]<10)
            {
            ans2[j++]=productName[i];
            }
        }
        return ans2;
    }
    public Shop(String[] productName,int[] productQuantity,float[] productPrice)
    {
        this.productName=productName;
        this.productQuantity=productQuantity;
        this.productPrice=productPrice;
    }
}