import java.util.Scanner;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	    //FILL THE CODE
	    String dateString=sc.nextLine();
	    try {
	        Date parsedDate=convertStringToDate(dateString);
	        System.out.println(dateString+" is a valid date");
	        
	    } catch(ParseException e) {
	        System.out.println(dateString+" is not a valid date");
	    }
	
	}
	
	public static Date convertStringToDate(String str)throws ParseException  {
	    DateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	    Date date=new Date();
	    sdf.setLenient(false);
	    date=sdf.parse(str);
		return date;
	}

}
