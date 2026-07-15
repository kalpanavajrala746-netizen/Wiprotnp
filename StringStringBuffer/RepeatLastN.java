package StringStringBuffer;

import java.util.Scanner;

public class RepeatLastN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.next();
        
        System.out.print("Enter number of characters (n): ");
        int n = sc.nextInt();
        
        // Guard clause: ensure n is valid and doesn't exceed the string length
        if (n >= 0 && n <= str.length()) {
            String last = str.substring(str.length() - n);
            
            System.out.print("Result: ");
            for (int i = 0; i < n; i++) {
                System.out.print(last);
            }
            System.out.println(); // Prints a clean newline at the end
        } else {
            System.out.println("Result: Error! 'n' cannot be greater than the string length or negative.");
        }
        
        sc.close();
    }
}
