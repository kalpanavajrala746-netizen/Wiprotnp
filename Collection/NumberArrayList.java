package list;

	import java.util.ArrayList;

	public class NumberArrayList {
	    public static void main(String[] args) {

	        ArrayList<Number> list = new ArrayList<>();

	        list.add(10);
	        list.add(20.5);
	        list.add(30.75f);
	        list.add(40L);

	        System.out.println("Numbers in ArrayList:");
	        for (Number n : list) {
	            System.out.println(n);
	        }
	    }
	}