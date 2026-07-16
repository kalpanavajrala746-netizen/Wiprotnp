package employee;

	import java.util.HashSet;
	import java.util.Scanner;

	public class CardSet {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        HashSet<String> set = new HashSet<>();

	        System.out.print("Enter number of cards: ");
	        int n = sc.nextInt();

	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter Symbol: ");
	            set.add(sc.next());
	        }

	        System.out.println("\nUnique Symbols");

	        for (String s : set) {
	            System.out.println(s);
	        }

	        sc.close();
	    }
	}