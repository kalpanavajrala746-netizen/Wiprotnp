package javafundamental;

import java.util.Scanner;

public class MiddleWay {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[3];
        int[] b = new int[3];

        System.out.println("Enter 3 elements for the first array:");
        for (int i = 0; i < 3; i++) {
            if (sc.hasNextInt()) {
                a[i] = sc.nextInt();
            }
        }

        System.out.println("Enter 3 elements for the second array:");
        for (int i = 0; i < 3; i++) {
            if (sc.hasNextInt()) {
                b[i] = sc.nextInt();
            }
        }

        int[] result = {a[1], b[1]};

        System.out.println("Middle elements array:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
