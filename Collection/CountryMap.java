package map;


	import java.util.*;

	public class CountryMap {

	    HashMap<String, String> M1 = new HashMap<>();

	    // Step 1
	    public HashMap<String, String> saveCountryCapital(String country, String capital) {
	        M1.put(country, capital);
	        return M1;
	    }

	    // Step 2
	    public String getCapital(String country) {
	        return M1.get(country);
	    }

	    // Step 3
	    public String getCountry(String capital) {
	        for (Map.Entry<String, String> e : M1.entrySet()) {
	            if (e.getValue().equals(capital))
	                return e.getKey();
	        }
	        return null;
	    }

	    // Step 4
	    public HashMap<String, String> createReverseMap() {
	        HashMap<String, String> M2 = new HashMap<>();

	        for (Map.Entry<String, String> e : M1.entrySet()) {
	            M2.put(e.getValue(), e.getKey());
	        }
	        return M2;
	    }

	    // Step 5
	    public ArrayList<String> getCountryList() {
	        return new ArrayList<>(M1.keySet());
	    }

	    public static void main(String[] args) {

	        CountryMap obj = new CountryMap();

	        obj.saveCountryCapital("India", "Delhi");
	        obj.saveCountryCapital("Japan", "Tokyo");
	        obj.saveCountryCapital("USA", "Washington");

	        System.out.println("Capital of India : " + obj.getCapital("India"));
	        System.out.println("Country of Tokyo : " + obj.getCountry("Tokyo"));

	        System.out.println("Reverse Map : " + obj.createReverseMap());

	        System.out.println("Country List : " + obj.getCountryList());
	    }
	}