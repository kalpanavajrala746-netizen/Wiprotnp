package javafundamental;

import java.util.Scanner;

public class SearchElement {

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

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        int index = -1;

        // Linear search logic
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                index = i;
                break; 
            }
        }

        // Informative output
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found (-1)");
        }

        sc.close();
    }
}

