package Functionalinterface;

	import java.util.*;
	import java.util.function.Predicate;

	public class PerfectSquarePredicate {

	    public static void main(String[] args) {

	        ArrayList<Integer> list = new ArrayList<>(
	                Arrays.asList(0,1,2,4,5,9,10,16,25,30));

	        Predicate<Integer> p = n -> {
	            int x = (int)Math.sqrt(n);
	            return x*x==n;
	        };

	        list.stream().filter(p).forEach(System.out::println);
	    }
	}