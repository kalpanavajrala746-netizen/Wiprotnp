package map;

	import java.util.*;

	public class CountryHashTable {

	    public static void main(String[] args) {

	        Hashtable<String, String> table = new Hashtable<>();

	        table.put("India", "Delhi");
	        table.put("Japan", "Tokyo");
	        table.put("USA", "Washington");

	        System.out.println("Capital of India: " + table.get("India"));

	        Enumeration<String> e = table.keys();

	        while (e.hasMoreElements()) {
	            String key = e.nextElement();
	            System.out.println(key + " -> " + table.get(key));
	        }
	    }
	}