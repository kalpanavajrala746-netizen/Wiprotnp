package Functionalinterface;

	import java.util.*;
	import java.util.function.Function;

	public class SumFunction {
	    public static void main(String[] args) {

	        ArrayList<Integer> list = new ArrayList<>(
	                Arrays.asList(1,2,3,4,5,6,7,8,9,10));

	        Function<ArrayList<Integer>, Integer> sum =
	                l -> l.stream().mapToInt(Integer::intValue).sum();

	        System.out.println("Sum = " + sum.apply(list));
	    }
	}