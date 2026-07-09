package javafundamental;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Prompt user for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Safety check to handle invalid matrix sizing
        if (rows <= 0 || cols <= 0) {
            System.out.println("Rows and columns must be greater than 0.");
            sc.close();
            return;
        }

        int[][] arr = new int[rows][cols];

        // Prompt user to populate the 2D matrix elements
        System.out.println("Enter the array elements row by row:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The given array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The reverse of the array is:");
        // Loop backwards starting from the last row and last column index
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
