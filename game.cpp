#include <iostream>   // Provides input/output functions such as cout and cin.
#include <cstdlib>    // Provides functions such as rand() and srand().
#include <ctime>      // Provides time(), which we use to create a changing random seed.

using namespace std;  // Allows us to write cout/cin instead of std::cout/std::cin.

int main() {  // The main() function is where the C++ program starts.

    srand(time(0));  // Seeds the random-number generator using the current time.

    int secretNumber = rand() % 100 + 1;  // Generates a random number between 1 and 100.
    int guess;                             // Stores the number entered by the player.
    int attempts = 0;                      // Stores how many guesses the player has made.

    cout << "============================\n";  // Prints the top border.
    cout << "     NUMBER GUESSING GAME\n";       // Prints the game title.
    cout << "============================\n";  // Prints the bottom border of the title.
    cout << "I have selected a number from 1 to 100.\n";  // Explains the game.
    cout << "Try to guess it!\n\n";                       // Tells the player to start guessing.

    do {  // Starts a loop that runs at least once.

        cout << "Enter your guess: ";  // Asks the player to enter a number.
        cin >> guess;                 // Reads the player's number from the terminal.

        attempts++;  // Increases the attempt counter by 1.

        if (guess > secretNumber) {  // Checks whether the guess is greater than the secret number.
            cout << "Too High!\n";   // Tells the player the guess is too high.
        }
        else if (guess < secretNumber) {  // Checks whether the guess is smaller than the secret number.
            cout << "Too Low!\n";         // Tells the player the guess is too low.
        }
        else {  // Runs when the guess is exactly equal to the secret number.
            cout << "\nCongratulations! You guessed it!\n";  // Displays the success message.
            cout << "Number = " << secretNumber << endl;     // Displays the correct number.
            cout << "Attempts = " << attempts << endl;       // Displays the total attempts.
        }

    } while (guess != secretNumber);  // Repeats until the player guesses the correct number.

    cout << "\nGame Over!\n";  // Displays the game-over message.

    return 0;  // Ends the program successfully.
}
