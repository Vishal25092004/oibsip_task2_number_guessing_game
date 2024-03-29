import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maxAttempts = 5;
        int randomNumber = random.nextInt(100) + 1; // Generates a random number between 1 and 100
        int attempts = 0;
        boolean hasGuessed = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Can you guess it?");
        System.out.println("You have " + maxAttempts + " attempts.");

        while (attempts < maxAttempts && !hasGuessed) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character from the input buffer

            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
                continue;
            }

            attempts++;

            if (guess == randomNumber) {
                System.out.println("Congratulations! You have guessed the number " + randomNumber + " correctly!");
                System.out.println("It took you " + attempts + " attempts.");
                hasGuessed = true;
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try guessing a higher number.");
            } else {
                System.out.println("Too high! Try guessing a lower number.");
            }
        }

        if (!hasGuessed) {
            System.out.println("Sorry, you've run out of attempts!");
            System.out.println("The number I was thinking of was: " + randomNumber);
        }

        scanner.close();
    }
}
