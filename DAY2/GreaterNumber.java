
	package DAY2;

	import java.util.Scanner;

	public class GreaterNumber {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int a = sc.nextInt();
	        int b = sc.nextInt();

	        if (a > b) {
	            System.out.println(a);
	        } else {
	            System.out.println(b);
	        }

	        sc.close();
	    }
	}