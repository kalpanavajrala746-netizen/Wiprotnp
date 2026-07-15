package classesandobjects;

public class Calculator {

    // Static method for int
    static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    // Static method for double
    static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {
        // Calling static methods directly without creating an object
        System.out.println("powerInt = " + powerInt(2, 3));
        System.out.println("powerDouble = " + powerDouble(2.5, 3));
    }
}
