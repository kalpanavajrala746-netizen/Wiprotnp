package javafundamental; // This line must match your folder structure

import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter the array elements:");

        arr[0] = sc.nextInt();
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);

        sc.close();
    }
}
