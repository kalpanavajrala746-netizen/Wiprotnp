package StringStringBuffer;

import java.util.Scanner;

public class RepeatFirstTwoChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        // Guard clause: ensure the string has at least 2 characters
        if (str.length() >= 2) {
            String first = str.substring(0, 2);
            
            System.out.print("Result: ");
            for (int i = 0; i < str.length(); i++) {
                System.out.print(first);
            }
            System.out.println(); // Prints a clean newline at the end
        } else {
            System.out.println("Result: String is too short! It must have at least 2 characters.");
        }
        
        sc.close();
    }
}
