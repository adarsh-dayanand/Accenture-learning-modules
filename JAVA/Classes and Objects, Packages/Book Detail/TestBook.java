import java.util.Scanner;
public class TestBook
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Book name:");
        String bookname=sc.nextLine();
        
        System.out.println("Enter the price:");
        int price=sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter the Author name:");
        String authorname=sc.nextLine();
        
        Book obj=new Book();
        obj.setBookName(bookname);
        obj.setBookPrice(price);
        obj.setAuthorName(authorname);
        System.out.println("Book Details");
        System.out.println("Book Name :"+obj.getBookName());
        System.out.println("Book Price :"+obj.getBookPrice());
        System.out.println("Author Name :"+obj.getAuthorName());
    }
}