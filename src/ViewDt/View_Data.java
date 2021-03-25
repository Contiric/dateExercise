package ViewDt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Callable;

public class View_Data {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		
	
	
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date x4 = new Date();
		
	

		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		Calendar cal = Calendar.getInstance();
		
		System.out.println(sdf1.format(d));

		
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		System.out.println(sdf1.format(d));
		
		
		
	}

}
