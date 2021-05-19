import java.util.*;
public class Library
{
    private ArrayList<Book> bookList=new ArrayList<Book>();
    public void addBook(Book bobj)
    {
        bookList.add(bobj);
    }
    public void setBookList(ArrayList<Book> l)
    {
        bookList=l;
    }
    public ArrayList<Book> getBookList()
    {
        return bookList;
    }
    public boolean isEmpty()
    {
        boolean f=false;
        if(bookList.isEmpty())
        {
            f=true;
        }
        return f;
    }
    public ArrayList<Book> viewBooksByAuthor(String author)
    {
        ArrayList<Book> a1=new ArrayList<Book>();
        for(int a=0;a<bookList.size();a++)
        {
            if(bookList.get(a).getAuthor().equalsIgnoreCase(author))
            {
                a1.add(bookList.get(a));
            }
        }
        return a1;
    }
    public ArrayList<Book> viewAllBooks()
    {
        return bookList;
    }
    public int countnoofbook(String bname)
    {
        int ctr=0;
        for(int a=0;a<bookList.size();a++)
        {
            if(bookList.get(a).getBookName().equalsIgnoreCase(bname))
            {
                ctr++;
            }
        }
        return ctr;
    }
}