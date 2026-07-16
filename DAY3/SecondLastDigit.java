package DAY3;
	import java.util.Scanner;

	public class SecondLastDigit {

	    public static int getSecondLastDigit(int n) {
	        n = Math.abs(n);

	        if (n < 10) {
	            return -1;
	        }

	        return (n / 10) % 10;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();
	        System.out.println(getSecondLastDigit(n));

	        sc.close();
	    }
	}