package genericLibraries;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;
import java.util.Random;

public class JavaUtility
{
 public int generateRandomNum(int limit)
 {
	 Random random=new Random();
	 return random.nextInt(limit); 
 }
 public int convertMonthToInt(String month)
 {
	 return DateTimeFormatter
			 .ofPattern("MMM")
			 .withLocale(Locale.ENGLISH)
			 .parse(month)
			 .get(ChronoField.MONTH_OF_YEAR);
 }
public String getCurrentTime() {
	// TODO Auto-generated method stub
	return null;
}
}
