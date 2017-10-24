import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class AgeCalculator {
	private static Scanner in;

	public static void main(String[] args) {

		System.out.println("Your year of birth: ");
		
		in = new Scanner(System.in);							//Get year of birth
		int birthday = in.nextInt();
		
		GregorianCalendar now = new GregorianCalendar(); 		//Get actual year
		int date = now.get(Calendar.YEAR);
		int age = date - birthday;
		
		int counterLeapTear=0;
		int counterNormalYear=0;
		int i = 0;
		
		while(i<age){												//Counting every year of life
		if((birthday%4==0 && birthday/100 != 0)||birthday%4==0){	//Check what year it was.

			counterLeapTear++;
			
		} else {
			counterNormalYear++;
			
					}
		birthday++;
		i++;
		}
		int ageInSeconds = (counterLeapTear*366*24*60) + (counterNormalYear*365*24*60);   //Convert years to seconds
		
		System.out.println("Your age  is: " +age);									// Print values
		System.out.println("Your age in seconds is: " +ageInSeconds);
		System.out.println("You lived in leap years: " +counterLeapTear);
		System.out.println("You lived in normal years: " +counterNormalYear);

	}

}
