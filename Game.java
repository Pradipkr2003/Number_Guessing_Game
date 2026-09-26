import java.util.Random;  // Imports Random so we can generate a random number.
import java.util.Scanner; // Imports Scanner so we can read input from the terminal.

public class Game {  // Defines the Game class. The file must be named Game.java.

    public static void main(String[] args) {  // The main() method is where the Java program starts.

        Random random = new Random();  // Creates a Random object for generating random numbers.
        Scanner scanner = new Scanner(System.in);  // Creates a Scanner object for keyboard input.

        int secretNumber = random.nextInt(100) + 1;  // Generates a random number from 1 to 100.
        int guess;                                    // Stores the number entered by the player.
        int attempts = 0;                             // Stores how many guesses the player has made.

        System.out.println("============================");  // Prints the top border.
        System.out.println("     NUMBER GUESSING GAME");       // Prints the game title.
        System.out.println("============================");  // Prints the bottom border of the title.
        System.out.println("I have selected a number from 1 to 100.");  // Explains the game.
        System.out.println("Try to guess it!\n");                       // Tells the player to start guessing.

        do {  // Starts a loop that runs at least once.

            System.out.print("Enter your guess: ");  // Asks the player to enter a number.
            guess = scanner.nextInt();              // Reads the player's number from the terminal.

            attempts++;  // Increases the attempt counter by 1.

            if (guess > secretNumber) {  // Checks whether the guess is greater than the secret number.
                System.out.println("Too High!");   // Tells the player the guess is too high.
            }
            else if (guess < secretNumber) {  // Checks whether the guess is smaller than the secret number.
                System.out.println("Too Low!");   // Tells the player the guess is too low.
            }
            else {  // Runs when the guess is exactly equal to the secret number.
                System.out.println("\nCongratulations! You guessed it!");  // Displays the success message.
                System.out.println("Number = " + secretNumber);           // Displays the correct number.
                System.out.println("Attempts = " + attempts);             // Displays the total attempts.
            }

        } while (guess != secretNumber);  // Repeats until the player guesses the correct number.

        System.out.println("\nGame Over!");  // Displays the game-over message.

        scanner.close();  // Closes the Scanner and releases the input resource.
    }
}
