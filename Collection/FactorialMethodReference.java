package methodrefference;

	interface Factorial {
	    int find(int n);
	}

	class MathDemo {

	    public int factorial(int n) {
	        int fact = 1;
	        for (int i = 1; i <= n; i++)
	            fact *= i;
	        return fact;
	    }
	}

	public class FactorialMethodReference {

	    public static void main(String[] args) {

	        MathDemo obj = new MathDemo();

	        Factorial f = obj::factorial;

	        System.out.println("Factorial = " + f.find(5));
	    }
	}