package StringStringBuffer;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String rev = "";
        
        // Looping backwards to reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        
        // Checking for equality
        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        
        sc.close();
    }
}
