package StringStringBuffer;

import java.util.Scanner;

public class HalfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        // Ternary operator alternative to shorten the code
        String result = (str.length() % 2 == 0) ? str.substring(0, str.length() / 2) : "null";
        
        System.out.println("Result: " + result);
        sc.close();
    }
}
