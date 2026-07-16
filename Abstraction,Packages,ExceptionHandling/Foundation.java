package Packages;

	public class Foundation {

	    private int var1 = 10;
	    int var2 = 20;
	    protected int var3 = 30;
	    public int var4 = 40;

	    public static void main(String[] args) {
	        Foundation f = new Foundation();

	        // System.out.println(f.var1); // Not Accessible
	        // System.out.println(f.var2); // Not Accessible
	        // System.out.println(f.var3); // Not Accessible
	        System.out.println(f.var4);
	    }
	}
