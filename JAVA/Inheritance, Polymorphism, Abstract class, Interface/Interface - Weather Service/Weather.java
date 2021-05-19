
import java.util.Scanner;

public class Weather 
{
	public static void main(String[] args)
	{
		WeatherInfo w=new WeatherInfo();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter city to get the weather and temperature - Delhi, Mumbai, Chennai, Kolkata");
		String loc=s.next();
		System.out.println(w.getWeather(loc));
		
		System.out.println("Enter city to get the weather and temperature - Delhi, Mumbai, Chennai, Kolkata");
		loc=s.next();
		System.out.println(w.getWeather(loc));
	}
	
	
}
