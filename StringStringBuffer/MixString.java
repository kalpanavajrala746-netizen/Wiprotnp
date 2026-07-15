package StringStringBuffer;

import java.util.Scanner;

public class MixString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String a = sc.next();
        
        System.out.print("Enter second string: ");
        String b = sc.next();
        
        // Using StringBuilder to dynamically build the string in memory efficiently
        StringBuilder result = new StringBuilder();
        int min = Math.min(a.length(), b.length());
        
        for (int i = 0; i < min; i++) {
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }
        
        if (a.length() > b.length()) {
            result.append(a.substring(min));
        } else {
            result.append(b.substring(min));
        }
        
        System.out.println("Result: " + result.toString());
        sc.close();
    }
}
