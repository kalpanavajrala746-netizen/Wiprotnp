package map;

	import java.util.*;

	public class PropertiesDemo {

	    public static void main(String[] args) {

	        Properties p = new Properties();

	        p.setProperty("Andhra Pradesh", "Amaravati");
	        p.setProperty("Telangana", "Hyderabad");
	        p.setProperty("Tamil Nadu", "Chennai");
	        p.setProperty("Karnataka", "Bengaluru");

	        Iterator<Object> it = p.keySet().iterator();

	        while (it.hasNext()) {
	            String state = (String) it.next();
	            System.out.println(state + " -> " + p.getProperty(state));
	        }
	    }
	}