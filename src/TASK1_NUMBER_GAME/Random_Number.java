package TASK1_NUMBER_GAME;

import java.util.Random;
import java.util.Scanner;

public class Random_Number {
    /*
     * 1. Generate a random number within a specified range, such as 1 to 100.
     * 2. Prompt the user to enter their guess for the generated number.
     * 3. Compare the user's guess with the generated number and provide feedback on whether the guess is correct, too high, or too low.
     * 4. Repeat steps 2 and 3 until the user guesses the correct number.
     * 5. Limit the number of attempts the user has to guess the number.
     * 6. Add the option for multiple rounds, allowing the user to play again.
     * 7. Display the user's score, which can be based on the number of attempts taken or rounds won.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("I have selected a number between " + minRange + " and " + maxRange + ". Try to guess it!");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
                    hasGuessedCorrectly = true;
                    score++;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }

            if (!hasGuessedCorrectly) {
                System.out.println("Sorry, you've run out of attempts. The correct number was: " + numberToGuess);
            }

            System.out.print("Play again? (yes/no): ");
            String playAgainResponse = scanner.next().toLowerCase();
            if (!playAgainResponse.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Thanks for playing! Your score: " + score + " rounds won.");
        scanner.close();
    }
}



