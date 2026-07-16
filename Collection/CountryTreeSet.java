package set;

	import java.util.TreeSet;

	public class CountryTreeSet {

	    TreeSet<String> T1 = new TreeSet<>();

	    public TreeSet<String> saveCountryNames(String CountryName) {
	        T1.add(CountryName);
	        return T1;
	    }

	    public String getCountry(String CountryName) {

	        if (T1.contains(CountryName))
	            return CountryName;
	        else
	            return null;
	    }

	    public static void main(String[] args) {

	        CountryTreeSet obj = new CountryTreeSet();

	        obj.saveCountryNames("India");
	        obj.saveCountryNames("USA");
	        obj.saveCountryNames("Japan");

	        System.out.println(obj.getCountry("India"));
	        System.out.println(obj.getCountry("China"));
	    }
	}