package set;

	import java.util.HashSet;

	public class CountryHashSet {

	    HashSet<String> H1 = new HashSet<>();

	    public HashSet<String> saveCountryNames(String CountryName) {
	        H1.add(CountryName);
	        return H1;
	    }

	    public String getCountry(String CountryName) {
	        if (H1.contains(CountryName))
	            return CountryName;
	        else
	            return null;
	    }

	    public static void main(String[] args) {

	        CountryHashSet obj = new CountryHashSet();

	        obj.saveCountryNames("India");
	        obj.saveCountryNames("USA");
	        obj.saveCountryNames("Japan");

	        System.out.println(obj.getCountry("India"));
	        System.out.println(obj.getCountry("China"));
	    }
	}