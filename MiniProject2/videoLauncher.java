package MiniProject2;

// FIX: Import statement must be outside and above the class definition
import java.util.Scanner; 

public class videoLauncher { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        videostore store = new videostore(); 
        int choice; 
        
        do { 
            System.out.println("\nMAIN MENU"); 
            System.out.println("=========="); 
            System.out.println("1. Add Videos"); 
            System.out.println("2. Check Out Video"); 
            System.out.println("3. Return Video"); 
            System.out.println("4. Receive Rating"); 
            System.out.println("5. List Inventory"); 
            System.out.println("6. Exit"); 
            System.out.print("Enter your choice (1..6): "); 
            
            choice = sc.nextInt(); 
            sc.nextLine(); // Consumes the leftover newline character
            
            switch (choice) { 
                case 1: 
                    System.out.print("Enter the name of the video you want to add: "); 
                    String name = sc.nextLine(); 
                    store.addVideo(name); 
                    break; 
                case 2: 
                    System.out.print("Enter the name of the video you want to check out: "); 
                    name = sc.nextLine(); 
                    store.doCheckout(name); 
                    break; 
                case 3: 
                    System.out.print("Enter the name of the video you want to return: "); 
                    name = sc.nextLine(); 
                    store.doReturn(name); 
                    break; 
                case 4: 
                    System.out.print("Enter the name of the video you want to rate: "); 
                    name = sc.nextLine(); 
                    System.out.print("Enter the rating: "); 
                    int rating = sc.nextInt(); 
                    store.receiveRating(name, rating); 
                    break; 
                case 5: 
                    store.listInventory(); 
                    break; 
                case 6: 
                    System.out.println("Exiting...!! Thanks for using the application."); 
                    break; 
                default: 
                    System.out.println("Invalid Choice."); 
            } 
        } while (choice != 6); 
        
        sc.close(); 
    } 
}
