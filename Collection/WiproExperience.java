package DateTimeApi;
	import java.time.LocalDate;
	import java.time.Period;

	public class WiproExperience {
	    public static void main(String[] args) {

	        LocalDate joiningDate = LocalDate.of(2022, 6, 15);
	        LocalDate today = LocalDate.now();

	        Period p = Period.between(joiningDate, today);

	        System.out.println("Experience:");
	        System.out.println(p.getYears() + " Years "
	                + p.getMonths() + " Months "
	                + p.getDays() + " Days");
	    }
	}