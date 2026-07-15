package StringStringBuffer;

import java.util.Scanner;

public class RemoveStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string containing a '*': ");
        String str = sc.nextLine();
        
        int index = str.indexOf('*');
        
        // Guard clause: ensure '*' exists and is not at the extreme edges
        if (index > 0 && index < str.length() - 1) {
            String result = str.substring(0, index - 1) + str.substring(index + 2);
            System.out.println("Result: " + result);
        } else if (index == -1) {
            System.out.println("Result: No asterisk found! String remains: " + str);
        } else {
            System.out.println("Result: Asterisk is at the edge, cannot remove neighbors safely.");
        }
        
        sc.close();
    }
}
