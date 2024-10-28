import java.util.Scanner;
import java.util.Stack;

public class BrowserHistoryStack {
    public static void main(String[] args) {
        // Let's keep track of the websites we've visited!
        Stack<String> history = new Stack<>();

        // Get input from the user
        Scanner scanner = new Scanner(System.in);

        // Store the user's choice
        int choice;

        // Keep showing the menu until the user chooses to exit
        do {
            // Show the menu to the user
            System.out.println("\n-Browser History-");
            System.out.println("1. Visit New Page");
            System.out.println("2. Go Back to Last Page");
            System.out.println("3. Delete All History");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            // Read the user's choice
            choice = scanner.nextInt();

            // Consume the leftover newline character in the input
            scanner.nextLine();

            // Handle the user's choice
            switch (choice) {
                case 1: // Visit a new page
                    System.out.print("Enter page URL: ");
                    String url = scanner.nextLine();
                    history.push(url);
                    System.out.println("Page added to history.");
                    break;
                case 2: // Go back to the last page
                    if (!history.isEmpty()) {
                        System.out.println("Last visited page: " + history.pop());
                    } else {
                        System.out.println("No history available.");
                    }
                    break;
                case 3: // Delete all history
                    history.clear();
                    System.out.println("All history deleted.");
                    break;
                case 4: // Exit
                    System.out.println("Exiting...");
                    break;
                default: // Invalid choice
                    System.out.println("Invalid choice. Please try again.");
            }

            // Add a blank line for better readability
            System.out.println();
        } while (choice != 4);

        // Close the scanner to release resources
        scanner.close();
    }
}