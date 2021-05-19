import java.util.*;
import java.text.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	    //FILL THE CODE
	    String d=sc.nextLine();
	    SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyy");
	    sdf.setLenient(false);
	    try{
	        Date javaDate=sdf.parse(d);
	        System.out.printf(d+" is a valid date");
	    }
	    catch(ParseException e){
	        System.out.println(d+" is not a valid date");
	    }
	}

}
