import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String d=sc.next();
		int n=sc.nextInt();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	    //FILL THE CODE
	    try{
	        Date date=sdf.parse(d);
    	    Calendar c= Calendar.getInstance();
    	    c.setTime(date);
    	    c.add(Calendar.MONTH, n);
    	    Date expiry=c.getTime();
    	    String strDate=sdf.format(expiry);
    	    System.out.println(strDate);
	    }
	    catch(ParseException e){
	        System.out.println("dn");
	    }
	
	}

}