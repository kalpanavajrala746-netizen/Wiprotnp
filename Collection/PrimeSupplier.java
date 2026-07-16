package Functionalinterface;

	import java.util.ArrayList;
	import java.util.function.Supplier;

	public class PrimeSupplier {

	    public static void main(String[] args) {

	        Supplier<ArrayList<Integer>> supplier = () -> {
	            ArrayList<Integer> list = new ArrayList<>();
	            int num = 2;

	            while (list.size() < 10) {
	                boolean prime = true;

	                for (int i = 2; i <= Math.sqrt(num); i++) {
	                    if (num % i == 0) {
	                        prime = false;
	                        break;
	                    }
	                }

	                if (prime) {
	                    list.add(num);
	                }
	                num++;
	            }

	            return list;
	        };

	        ArrayList<Integer> primes = supplier.get();

	        System.out.println("First 10 Prime Numbers:");
	        for (int n : primes) {
	            System.out.print(n + " ");
	        }
	    }
	}