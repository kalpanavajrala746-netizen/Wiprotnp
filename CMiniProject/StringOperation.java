package employee;

	import java.util.ArrayList;
	import java.util.Scanner;

	public class StringOperation {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        ArrayList<String> list = new ArrayList<>();

	        System.out.print("Enter number of strings: ");
	        int n = sc.nextInt();
	        sc.nextLine();

	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter String: ");
	            list.add(sc.nextLine());
	        }

	        System.out.println("\nString Details");

	        for (String s : list) {
	            System.out.println("Original : " + s);
	            System.out.println("Uppercase : " + s.toUpperCase());
	            System.out.println("Length : " + s.length());
	            System.out.println();
	        }

	        sc.close();
	    }
	}