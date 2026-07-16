package Functionalinterface;

	import java.util.*;
	import java.util.function.Predicate;

	public class PalindromePredicate {
	    public static void main(String[] args) {

	        ArrayList<String> list = new ArrayList<>(Arrays.asList(
	                "madam","java","level","radar","hello",
	                "noon","abc","wow","code","mom"));

	        Predicate<String> p =
	                s -> s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());

	        list.stream().filter(p).forEach(System.out::println);
	    }
	}