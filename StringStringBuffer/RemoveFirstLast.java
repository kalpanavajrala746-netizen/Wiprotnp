package StringStringBuffer;

import java.util.Scanner;

public class RemoveFirstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        if (str.length() >= 2) {
            StringBuilder sb = new StringBuilder(str);
            // Delete the last character first so indices don't shift unpredictably
            sb.deleteCharAt(sb.length() - 1); 
            // Delete the first character (index 0)
            sb.deleteCharAt(0); 
            
            System.out.println("Result: " + sb.toString());
        } else {
            System.out.println("Result: String is too short!");
        }
        
        sc.close();
    }
}
