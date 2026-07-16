package LambdaExpressions;

	import java.util.*;

	public class ReverseWordsLambda {

	    public static void main(String[] args) {

	        ArrayList<String> al = new ArrayList<>();

	        al.add("Java");
	        al.add("Python");
	        al.add("HTML");
	        al.add("CSS");
	        al.add("Spring");
	        al.add("SQL");
	        al.add("React");
	        al.add("Node");
	        al.add("Oracle");
	        al.add("Linux");

	        al.stream()
	          .sorted(Collections.reverseOrder())
	          .forEach(s -> System.out.println(s));
	    }
	}