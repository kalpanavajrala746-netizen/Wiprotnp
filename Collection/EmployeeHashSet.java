package set;

	import java.util.HashSet;
	import java.util.Iterator;

	public class EmployeeHashSet {

	    public static void main(String[] args) {

	        HashSet<String> employees = new HashSet<>();

	        employees.add("Kalpana");
	        employees.add("Ravi");
	        employees.add("Anitha");
	        employees.add("Kiran");

	        Iterator<String> it = employees.iterator();

	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }
	    }
	}