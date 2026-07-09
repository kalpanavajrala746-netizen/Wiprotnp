package javafundamental;

public class BiggestNumber {

    public static void main(String[] args) {

        // Validate that exactly 9 command-line arguments are provided
        if (args.length != 9) {
            System.out.println("Please enter 9 integer numbers");
            return;
        }

        int[][] arr = new int[3][3];

        int k = 0;
        int max = Integer.parseInt(args[0]);

        // Populate the 3x3 matrix and look for the biggest number
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                arr[i][j] = Integer.parseInt(args[k]);

                if (arr[i][j] > max) {
                    max = arr[i][j];
                }

                k++;
            }
        }

        System.out.println("The given array is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The biggest number in the given array is " + max);
    }
}
