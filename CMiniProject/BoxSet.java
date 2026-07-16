package employee;

	import java.util.HashSet;
	import java.util.Scanner;

	public class BoxSet {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        HashSet<Integer> boxes = new HashSet<>();

	        System.out.print("Enter number of boxes: ");
	        int n = sc.nextInt();

	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter Box ID: ");
	            boxes.add(sc.nextInt());
	        }

	        System.out.println("\nUnique Box IDs");

	        for (int id : boxes) {
	            System.out.println(id);
	        }

	        sc.close();
	    }
	}