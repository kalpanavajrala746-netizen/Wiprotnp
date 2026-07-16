package LambdaExpressions;

	import java.util.*;

	public class PrimeLambda {

	    public static void main(String[] args) {

	        ArrayList<Integer> al = new ArrayList<>();
	        Random r = new Random();

	        for (int i = 0; i < 25; i++)
	            al.add(r.nextInt(100) + 1);

	        System.out.println("Numbers: " + al);

	        System.out.println("Prime Numbers:");
	        al.forEach(n -> {
	            boolean prime = n > 1;
	            for (int i = 2; i <= Math.sqrt(n); i++) {
	                if (n % i == 0) {
	                    prime = false;
	                    break;
	                }
	            }
	            if (prime)
	                System.out.print(n + " ");
	        });
	    }
	}