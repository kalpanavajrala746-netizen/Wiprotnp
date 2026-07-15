package StringStringBuffer;

import java.util.Scanner;

public class RemoveX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        // Handle the front 'x' safely
        if (str.startsWith("x")) {
            str = str.substring(1);
        }
        
        // Handle the back 'x' safely by ensuring the string isn't now empty
        if (str.endsWith("x") && str.length() > 0) {
            str = str.substring(0, str.length() - 1);
        }
        
        System.out.println("Result: " + str);
        sc.close();
    }
}
