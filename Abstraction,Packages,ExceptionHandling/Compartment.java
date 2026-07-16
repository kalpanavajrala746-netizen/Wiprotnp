package Packages;

	public class Compartment {

	    int height;
	    int width;
	    int breadth;

	    public Compartment(int height, int width, int breadth) {
	        this.height = height;
	        this.width = width;
	        this.breadth = breadth;
	    }

	    public static void main(String[] args) {
	        Compartment c = new Compartment(10, 20, 30);

	        System.out.println("Height : " + c.height);
	        System.out.println("Width : " + c.width);
	        System.out.println("Breadth : " + c.breadth);
	    }
	}
