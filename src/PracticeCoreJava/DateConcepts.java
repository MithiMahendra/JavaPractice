package PracticeCoreJava;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyy HH:mm:ss");
		String dateFormat = sdf.format(d);
		String date = d.toString();
		System.out.println(date);
		System.out.println(dateFormat.replace(" ", "_").replace(":", "_"));
	}

}
