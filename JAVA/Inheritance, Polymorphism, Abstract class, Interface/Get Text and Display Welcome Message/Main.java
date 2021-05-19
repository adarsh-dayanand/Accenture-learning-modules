
public class Main
{   
    public static DisplayText welcomeMessage()
    {
        DisplayText dt=(text)->
        {
            
                System.out.println("Welcome "+text);
            
        };
       return dt;
    }
    public static void main(String args[])
    { 
        DisplayText ref;
        ref=welcomeMessage();
        String str=ref.getInput();
        ref.displayText(str);
        
    }
}