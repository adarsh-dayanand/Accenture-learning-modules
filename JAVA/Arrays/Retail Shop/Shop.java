import java.util.*;
public class Shop 
{   
    private String shopName;
    private String shopAddress;
    private String[] products;
    
    public Shop(String shopName, String shopAddress, String[] products)
    {
        this.shopName=shopName;
        this.shopAddress=shopAddress;
        this.products=products;
    }
    
    public boolean checkProductAvailability(String productname)
    {int len=products.length;
        for(int i=0;i<len;i++)
        {
            if(productname.equalsIgnoreCase(products[i]))
            {
                return true;
            }
        }
        return false;
    }
    
   /* public void setShopName(String shopName)
    {
        this.shopName=shopName;
    }*/
    
    public String getShopName()
    {
        return this.shopName;
    }
    
    /*public void setShopAddress(String shopAddress)
    {
        this.shopAddress=shopAddress;
    }*/
    
    public String getShopAddress()
    {
        return this.shopAddress;
    }
    
    /*public void setProducts(String[] products)
    {
        this.products=products;
    }*/
    
    public String[] getProducts()
    {
        return this.products;
    }

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        //Shop obj=new Shop();
        
        System.out.println("Enter the shopname:");
        String shop_name=sc.nextLine();
        
        System.out.println("Enter the address:");
        String shop_address=sc.nextLine();
        
        System.out.println("Enter number of products:");
        int no_products=sc.nextInt();
        sc.nextLine();
        String[] products=new String[no_products];
        for(int i=0;i<no_products;i++)
        {
            products[i]=sc.nextLine();
        }
        
        Shop obj=new Shop(shop_name, shop_address, products);
        //obj.setShopName(shop_name);
        //obj.setShopAddress(shop_address);
        //obj.setProducts(products);
        
        System.out.println("Enter the product to be searched:");
        String srch=sc.nextLine();
        
        if(obj.checkProductAvailability(srch))
        {
            System.out.println("Product is available at "+obj.getShopName()+", "+obj.getShopAddress());
        }
        else
        {
            System.out.println("Product is not available at "+obj.getShopName()+", "+obj.getShopAddress());
        }
    }
}