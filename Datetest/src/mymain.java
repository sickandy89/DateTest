import java.util.Calendar;


public class mymain {
public static void main(String[] args) {
		
	Calendar c = Calendar.getInstance();
	System.out.println(c.get(Calendar.HOUR_OF_DAY));
	System.out.println(c.get(Calendar.MINUTE));
	System.out.println(c.get(Calendar.MONTH));
	System.out.println("Test");
}
}
