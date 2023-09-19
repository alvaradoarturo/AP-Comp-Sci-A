/**
 * Unit3Review
 */
import java.util.Random;
import java.util.Scanner;

public class Unit3Review {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(
      "Enter in a number that is in between 1 and 100 inclusive"
    );
    int num = scanner.nextInt();
    while (num < 1 || num > 100) {
      System.out.println("Invalid number try again");
      num = scanner.nextInt();
    }
    System.out.println("Number: " + num + " is valid");
    // boolean couting = true;
    // int num2 = 0;
    // int sum = 0;
    // while (couting) {
    //   System.out.println("Enter number: ");
    //   num2 = scanner.nextInt();
    //   sum += num2;
    //   System.out.println(sum);
    //   if (sum >= 100) {
    //     couting = false;
    //   }

    // Random random = new Random();
    // int numGuess = 0;
    // int randomNumber = random.nextInt(100);
    // //System.out.println(randomNumber);
    // boolean playingGame = true;
    // int count = 0;
    // while (playingGame) {
    //   System.out.println("Guess the number");
    //   numGuess = scanner.nextInt();
    //   if (numGuess == randomNumber) {
    //     System.out.println("YOU WON");
    //     playingGame = false;
    //   } else if (numGuess > randomNumber) {
    //     System.out.println("Too high");
    //   } else {
    //     System.out.println("Too low");
    //   }
    //   count++;
    // }
    // System.out.println("You guessed: " + count + " times");

  }
}
/*
Create a number guessing game where the program generates a 
random number between 1 and 100, and the user has to guess 
the number. If the user's guess is too high, display "Too high, 
try again." If the guess is too low, display "Too low, try again." 
Continue this process until the user guesses the correct number.
 */
/*
 *
 **
 ***
 ****
 *****
 ******
 *******
 ********
 */
