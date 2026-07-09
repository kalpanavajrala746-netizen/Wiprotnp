package javafundamental;

import java.util.Scanner;

public class Only14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Explicit user prompt for size
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        // Safety check to handle empty sizes safely
        if (n <= 0) {
            System.out.println("Result: true"); 
            sc.close();
            return;
        }

        int[] arr = new int[n];

        // Explicit user prompt for elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean flag = true;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 1 && arr[i] != 4) {
                flag = false;
                break; // Stop checking immediately if an invalid number is found
            }
        }

        System.out.println("Result: " + flag);

        sc.close();
    }
}
