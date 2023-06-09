package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// current date
		LocalDate myDate = LocalDate.now();
		System.out.println(myDate);

		// current time
		LocalTime myTime = LocalTime.now();
		System.out.println(myTime);

		// current datetime
		LocalDateTime myDate1 = LocalDateTime.now();
		System.out.println("before format:" + myDate1);
		
		//datetime formatter
		DateTimeFormatter mdf=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String modDateTime= myDate1.format(mdf);
		System.out.println("After format:"+modDateTime);
		
		//pattern 1
		DateTimeFormatter mdf1=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String modDateTime1= myDate1.format(mdf1);
		System.out.println("After format:"+modDateTime1);
		
		//pattern 2
		DateTimeFormatter mdf2=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String modDateTime2= myDate1.format(mdf2);
		System.out.println("After format:"+modDateTime2);
		
		//pattern 3
		DateTimeFormatter mdf3=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String modDateTime3= myDate1.format(mdf3);
		System.out.println("After format:"+modDateTime3);
		
		//pattern 4
		DateTimeFormatter mdf4=DateTimeFormatter.ofPattern("E,MMM dd yyyy");
		String modDateTime4= myDate1.format(mdf4);
		System.out.println("After format:"+modDateTime4);
		
		String dateStr= "26/01/2023";
		LocalDate d= LocalDate.parse(dateStr,mdf2);
		System.out.println(d);
		

	}

}
