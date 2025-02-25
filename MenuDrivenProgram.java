import java.util.Scanner;

public class MenuDrivenProgram {
    static Scanner scanner = new Scanner(System.in);

    // Method to display the menu and get the user's choice
    public static int displayMenu() {
        System.out.print("Menu:\n");
        System.out.print("1. Greet User\n");
        System.out.print("2. Check Even/Odd\n");
        System.out.print("3. Exit\n");
        System.out.print("Enter your choice (1-3): ");
        int menu = scanner.nextInt();
        return menu;
    }

    // Method to handle the menu choice
    public static String handleMenuChoice(int choice) {
        if (choice == 1) {
            return "Hello! Welcome!\n";
        } else if (choice == 2) {
            return "Enter an Integer: ";
        } else if (choice == 3) {
            return "Goodbye!\n";
        } else {
            return "Invalid choice! Please enter 1, 2, or 1-3\n";
        }
    }

    // Method to check if the number is even or odd
    public static String checkEvenOrOdd(int number) {  // Fixed the parameter name to 'number'
        if (number % 2 == 0) {  // Calculation for even number
            return number + " is an Even number.\n";  // Returning a message for even number
        } else {
            return number + " is an Odd number.\n";  // Returning a message for odd number
        }
    }

    // Main method where the program runs
    public static void main(String[] args) {
        while(true) {  //Used a while loop to continuously run the menu until the user broke out of the loop.
            int choice = displayMenu();  // Call displayMenu to get the user's choice
            String result = handleMenuChoice(choice);  // Call handleMenuChoice to get the appropriate message
            System.out.println(result); // Output the result from handleMenuChoice
            
            if (choice == 2) {  //To run even and odd if the user's enter choice 2
                int number = scanner.nextInt();
                String evenOddResult = checkEvenOrOdd(number);
                System.out.println(evenOddResult);
            }
            
            if (choice == 3) {  //Breaking the loop
                break;
            }
        }
        scanner.close();
    }

}

