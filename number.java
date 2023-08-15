import java.util.Random;
import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Number Guessing Game");
        System.out.println("Try to guess the selected number from 1 to 100");

        while (true) {
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly in " + attempts + " attempts.");
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("Higher");
            } else {
                System.out.println("Lower");
            }
        }

        scanner.close();
    }
}
