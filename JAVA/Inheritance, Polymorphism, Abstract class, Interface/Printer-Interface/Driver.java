public class Driver{
    
    public static void main(String[] args)
    {
        //create an object of LaserPrinter with reference as Printer and invoke the print method and display the result
        Printer pr=new LaserPrinter();
        System.out.println(pr.print());
    }
    
}