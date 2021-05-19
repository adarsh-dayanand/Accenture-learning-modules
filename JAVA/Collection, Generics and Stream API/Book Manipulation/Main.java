import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Library obj=new Library();
        int i=0;
        while(i==0)
        {
            System.out.println("1.Add Book\n2.Display all book details\n3.Search Book by author\n4.Count number of books - by book name\n5.Exit");
            System.out.println("Enter your choice:");
            int n=Integer.parseInt(sc.nextLine());
            if(n==1)
            {
                Book obj1=new Book();
                System.out.println("Enter the isbn no:");
                obj1.setIsbnno(Integer.parseInt(sc.nextLine()));
                System.out.println("Enter the book name:");
                obj1.setBookName(sc.nextLine());
                System.out.println("Enter the author name:");
                obj1.setAuthor(sc.nextLine());
                obj.addBook(obj1);
            }
            else if(n==2)
            {
                if(obj.isEmpty())
                {
                    System.out.println("The list is empty");
                }
                else
                {
                    ArrayList<Book> b=obj.viewAllBooks();
                    for(Book a:b)
                    {
                        System.out.println("ISBN no:"+a.getIsbnno());
                        System.out.println("Book name:"+a.getBookName());
                        System.out.println("Author name:"+a.getAuthor());
                    }
                }
            }
            else if(n==3)
            {
                System.out.println("Enter the author name:");
                String s=sc.nextLine();
                for(Book b:obj.viewBooksByAuthor(s))
                {
                    if(obj.viewBooksByAuthor(s).isEmpty())
                    {
                        System.out.println("None of the book published by the author "+s);
                        
                    }
                    else
                    {
                        System.out.println("ISBN no:"+b.getIsbnno());
                        System.out.println("Book name:"+b.getBookName());
                        System.out.println("Author name:"+b.getAuthor());
                    }
                }
            }
        }
    }
}