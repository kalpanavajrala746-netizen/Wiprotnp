package javafundamental;

import java.util.Scanner;

public class ASCIICharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        // Safety check to handle invalid sizes
        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter ASCII values:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Characters:");
        for (int i = 0; i < n; i++) {
            // Explicit type casting converts the integer ASCII value to its character representation
            System.out.print((char) arr[i] + " ");
        }
        System.out.println(); // Prints a clean newline at the end

        sc.close();
    }
}
