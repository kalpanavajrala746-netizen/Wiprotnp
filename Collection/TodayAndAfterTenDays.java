package DateTimeApi;

	import java.time.LocalDate;

	public class TodayAndAfterTenDays {
	    public static void main(String[] args) {
	        LocalDate today = LocalDate.now();
	        System.out.println("Today's Date : " + today);
	        System.out.println("After 10 Days: " + today.plusDays(10));
	    }
	}