/**
 * Unit3Review
 */
import java.util.Random;
import java.util.Scanner;

public class Unit3Review {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Random random = new Random();

    // int randomNumber = random.nextInt(101);
    // System.out.println("Guess");
    // int guess = scanner.nextInt();
    // int count = 1;
    // while (randomNumber != guess) {
    //   if (randomNumber > guess) {
    //     System.out.println("Higher");
    //   } else {
    //     System.out.println("Lower");
    //   }
    //   count++;
    //   guess = scanner.nextInt();
    // }
    // System.out.println("Nice you took " + count + " guesses");

    int base = scanner.nextInt();
    int exponent = scanner.nextInt();
    int result = base;
    while (exponent > 1) {
      result *= base;
      exponent--;
    }
    System.out.println(result);
  }
}
/*
Power Calculator
---------------
Write a java program that calculates the result of raising a given number 
to a specified power using a while loop. The user should enter the base
and the exponent, and the program should display the result.
 */
/*
Iterations Cont'd
-----------------
The for loop

The general form of the for loop is
  for(intialization ; termination condition ; update statement){
    statements // body of loop
  }
  The termination condition is tested at the top of the loop;
  the update statement is performed at the bottom

  for(int i = 1; i < 5; i++){
    System.out.print(i + " ");
  }
  int j;
  for(j = 2; j <= 10; j+=2){
    System.out.print(j +  " ");
  }
  * Loop variable should not change inside the loop body
 */
