import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input an integer
        System.out.print("Enter an integer: ");
        
        // Read the input as a string
        String userInput = scanner.nextLine();

        try {
            // Convert the input string to an integer
            int num = Integer.parseInt(userInput);

            // Call the method to calculate and print the sum and individual digits
            sumAndDigits(num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }

    public static void sumAndDigits(int num) {
        // Convert the number to its absolute value and then to a string
        String numStr = Integer.toString(Math.abs(num));

        // Print individual digits
        System.out.print("Individual digits: ");
        for (int i = 0; i < numStr.length(); i++) {
            System.out.print(numStr.charAt(i) + " ");
        }

        // Calculate the sum of digits
        int digitSum = 0;
        for (int i = 0; i < numStr.length(); i++) {
            digitSum += Character.getNumericValue(numStr.charAt(i));
        }

        // Print the sum
        System.out.println("\nSum of digits: " + digitSum);
    }
}
