package javafundamental;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Prompt user for the size of the array
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        // Safety check to handle invalid sizes
        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        // Prompt user to enter the elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorts the array elements in ascending order
        Arrays.sort(arr);

        // Display the sorted output
        System.out.println("Sorted array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Prints a clean newline at the end

        sc.close();
    }
}
