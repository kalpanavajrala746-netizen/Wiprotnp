package map;

	import java.util.*;

	public class CountryTreeMap {

	    public static void main(String[] args) {

	        TreeMap<String, String> map = new TreeMap<>();

	        map.put("India", "Delhi");
	        map.put("Japan", "Tokyo");
	        map.put("USA", "Washington");

	        System.out.println("Capital of India: " + map.get("India"));

	        for (Map.Entry<String, String> e : map.entrySet()) {
	            System.out.println(e.getKey() + " -> " + e.getValue());
	        }
	    }
	}