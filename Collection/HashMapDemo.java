package map;

	import java.util.*;

	public class HashMapDemo {

	    public static void main(String[] args) {

	        HashMap<String, String> map = new HashMap<>();

	        map.put("101", "Kalpana");
	        map.put("102", "Ravi");
	        map.put("103", "Anitha");

	        // a) Check key
	        System.out.println("Key 101 Exists : " + map.containsKey("101"));

	        // b) Check value
	        System.out.println("Value Ravi Exists : " + map.containsValue("Ravi"));

	        // c) Iterate using Iterator
	        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();

	        while (it.hasNext()) {
	            Map.Entry<String, String> e = it.next();
	            System.out.println(e.getKey() + " -> " + e.getValue());
	        }
	    }
	}