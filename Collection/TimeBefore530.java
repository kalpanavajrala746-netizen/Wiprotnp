package DateTimeApi;

	import java.time.LocalTime;

	public class TimeBefore530 {
	    public static void main(String[] args) {

	        LocalTime time = LocalTime.now();

	        System.out.println("Current Time : " + time);
	        System.out.println("Before 5 Hours 30 Minutes : "
	                + time.minusHours(5).minusMinutes(30));
	    }
	}