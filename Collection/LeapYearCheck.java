package DateTimeApi;

	import java.time.Year;

	public class LeapYearCheck {
	    public static void main(String[] args) {

	        Year year = Year.now();

	        if (year.isLeap()) {
	            System.out.println(year + " is Leap Year");
	        } else {
	            System.out.println(year + " is Not Leap Year");
	        }
	    }
	}
