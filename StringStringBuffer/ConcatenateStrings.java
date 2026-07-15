package StringStringBuffer;

import java.util.Scanner;

public class ConcatenateStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String s1 = sc.next();
        System.out.print("Enter second string: ");
        String s2 = sc.next();
        
        // Guard clause to handle empty strings safely
        if (s1.isEmpty() || s2.isEmpty()) {
            System.out.println((s1 + s2).toLowerCase());
        } 
        // Check if last char of s1 matches the first char of s2
        else if (s1.charAt(s1.length() - 1) == s2.charAt(0)) {
            System.out.println((s1 + s2.substring(1)).toLowerCase());
        } 
        else {
            System.out.println((s1 + s2).toLowerCase());
        }
        
        sc.close();
    }
}
