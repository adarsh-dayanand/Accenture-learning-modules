import java.util.*;
public class Main{
    public static void main (String[] args) 
{
        
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of products:");
    int no=sc.nextInt();
    
    String[] pName= new String[no];
    float[] pPrice=new float[no];
    int[] pQuantity=new int[no];
    System.out.println("Enter product names:");
    for(int i=0;i<no;i++) {pName[i]=sc.next();}
    System.out.println("Enter the price of each product:");
    for(int i=0;i<no;i++) {pPrice[i]=sc.nextFloat();}
    System.out.println("Enter the quantity of each product:");
    for(int i=0;i<no;i++)
    {
        pQuantity[i]=sc.nextInt();
    }
    System.out.println("Enter the product price to be searched:");
    float priceSearch=sc.nextFloat();
    System.out.println("Enter the product quantity to be searched:");
    int quantitySearch=sc.nextInt();
    System.out.println("Search based on price");
    Shop s=new Shop(pName,pQuantity,pPrice);
    String[] ansPrice=s.search(priceSearch);
    for(int i=0;i<ansPrice.length;i++)
    {
        System.out.println(ansPrice[i]);
    }
    System.out.println("Search based on quantity");
    String[] ansQuantity=s.search(quantitySearch);
    for(int i=0;i<ansQuantity.length;i++)
    {
        System.out.println(ansQuantity[i]);
    }
    System.out.println("Products below re-ordered level");
    String[] ansOrder=s.search();
    for(int i=0;i<ansOrder.length;i++)
    {
        System.out.println(ansOrder[i]);
    }
}
    
}