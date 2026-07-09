package javafundamental;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Clear user prompt for array size
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        // Safety check to handle empty arrays
        if (n <= 0) {
            System.out.println("{}");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        // Clear user prompt for elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorting is required for this specific adjacent-comparison logic to work
        Arrays.sort(arr);

        System.out.print("Unique elements: {");

        for (int i = 0; i < n; i++) {
            // Check if it's the last element or distinct from the next one
            if (i == n - 1 || arr[i] != arr[i + 1]) {
                System.out.print(arr[i]);

                // Only print a comma if this isn't the absolute final unique element printed
                if (i != n - 1) {
                    System.out.print(",");
                }
            }
        }

        System.out.println("}");

        sc.close();
    }
}
