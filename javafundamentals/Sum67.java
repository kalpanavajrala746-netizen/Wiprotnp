package javafundamental;

import java.util.Scanner;

public class Sum67 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Calculated Sum = 0");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }

        int sum = 0;
        boolean ignore = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 6) {
                ignore = true;
            }

            if (!ignore) {
                sum += arr[i];
            }

            if (ignore && arr[i] == 7) {
                ignore = false;
            }
        }

        System.out.println("Calculated Sum = " + sum);
        sc.close();
    }
}
