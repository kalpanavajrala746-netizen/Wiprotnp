package streamapi;

	import java.util.*;
	import java.util.stream.Collectors;

	public class NegativeEvenFilter {

	    public static void main(String[] args) {

	        ArrayList<Integer> list = new ArrayList<>(
	                Arrays.asList(-2, 5, -8, 10, -12, 15, 20, -6, 7));

	        ArrayList<Integer> result = list.stream()
	                .filter(n -> n < 0 && n % 2 == 0)
	                .collect(Collectors.toCollection(ArrayList::new));

	        System.out.println(result);
	    }
	}