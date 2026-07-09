package javafundamental;

import java.util.Scanner;

public class WithoutTen {

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
        int[] result = new int[n]; // Elements default to 0 automatically

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = 0;

        // Shift non-10 elements to the front of the result array
        for (int i = 0; i < n; i++) {
            if (arr[i] != 10) {
                result[index++] = arr[i];
            }
        }

        System.out.println("Resulting array:");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println(); // Clear newline at the end

        sc.close();
    }
}

