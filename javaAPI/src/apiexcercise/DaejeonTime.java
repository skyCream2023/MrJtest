package apiexcercise;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DaejeonTime {

	public static void main(String[] args) {
		LocalDate nowDate = LocalDate.now();
		LocalTime nowTime = LocalTime.now();
		
		LocalDateTime nowDateTime = LocalDateTime.of(nowDate, nowTime);
		System.out.println(nowDateTime);
		
		
		LocalDate birthDate = LocalDate.of(1990, 7, 26);
		LocalDate currentDate = LocalDate.of(2024, 3, 4);
		Period howLongP = Period.between(birthDate, currentDate);
		
		System.out.println(howLongP);
		
		LocalDate date = LocalDate.now();
		DateTimeFormatter isoDate = DateTimeFormatter.ISO_DATE;
				System.out.println(date.format(isoDate));
				
				DateTimeFormatter fullDateStyle =
						DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
				System.out.println(date.format(fullDateStyle));
				
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy-MMM-dd - E D");
		System.out.println(zdt.format(dtf));
		
		DateTimeFormatter timeFormatter1 = DateTimeFormatter.ofPattern("hh:mm:ss a z G");
		System.out.println(zdt.format( timeFormatter1));
		
		DateTimeFormatter dateFormatter2 = 
				DateTimeFormatter.ofPattern("''yyyy'년 'MMM' 'dd'일'");
		System.out.println(zdt.format( dateFormatter2));
		
		String dateTimeString = "2024-03-04 16:15";
		DateTimeFormatter timeFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime ldt = LocalDateTime.parse(dateTimeString, timeFormatter2);
		System.out.println(ldt);
	}

}
