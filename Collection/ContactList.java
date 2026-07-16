package map;

	import java.util.*;

	public class ContactList {

	    public static void main(String[] args) {

	        HashMap<String, Integer> contacts = new HashMap<>();

	        contacts.put("Kalpana", 123456789);
	        contacts.put("Ravi", 987654321);
	        contacts.put("Anitha", 555555555);

	        System.out.println("Key Exists: " + contacts.containsKey("Kalpana"));
	        System.out.println("Value Exists: " + contacts.containsValue(987654321));

	        Iterator<Map.Entry<String, Integer>> it = contacts.entrySet().iterator();

	        while (it.hasNext()) {
	            Map.Entry<String, Integer> e = it.next();
	            System.out.println(e.getKey() + " : " + e.getValue());
	        }
	    }
	}