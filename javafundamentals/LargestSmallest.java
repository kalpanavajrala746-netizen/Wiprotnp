package javafundamental;

import java.util.Arrays;
import java.util.Scanner;

public class LargestSmallest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        // Safety check to ensure we can fetch at least two unique positions
        if (n < 2) {
            System.out.println("Array size must be at least 2 to find two smallest and largest values.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorts the array in ascending order
        Arrays.sort(arr);

        System.out.println("Smallest 1 = " + arr[0]);
        System.out.println("Smallest 2 = " + arr[1]);

        System.out.println("Largest 1 = " + arr[n - 1]);
        System.out.println("Largest 2 = " + arr[n - 2]);

        sc.close();
    }
}
