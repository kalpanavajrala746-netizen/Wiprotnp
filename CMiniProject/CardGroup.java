package employee;

	import java.util.HashMap;
	import java.util.Map;
	import java.util.Scanner;

	public class CardGroup {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        HashMap<String, Integer> map = new HashMap<>();

	        System.out.print("Enter number of cards: ");
	        int n = sc.nextInt();

	        for (int i = 0; i < n; i++) {

	            System.out.print("Enter Symbol: ");
	            String symbol = sc.next();

	            map.put(symbol, map.getOrDefault(symbol, 0) + 1);
	        }

	        System.out.println("\nCard Groups");

	        for (Map.Entry<String, Integer> e : map.entrySet()) {
	            System.out.println(e.getKey() + " : " + e.getValue());
	        }

	        sc.close();
	    }
	}