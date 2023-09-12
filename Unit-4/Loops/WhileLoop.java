/*
  Iteration (repetition of a process)
  --------------------
  Control Structures:
    1. while loop
    while(boolean test){ // condition
      statements // loop body
    }
    - boolean test is performed at the beginning of the loop
      - if true, loop body is executed 
      - otherwise, passes to first statement after loop
    - after execution of loop body, test is performed again
      - repeat process
  
 */
import java.util.Scanner;

public class DataTypes {

  public static void main(String[] args) {
    int i = 1;
    int mult3 = 3;
    while (mult3 < 20) {
      System.out.print(mult3 + " ");
      i++;
      mult3 *= i;
    }
    /*
     * Loop body must contain a statement that leads to termination
     * It's possible for the loop body to never be executed
     *  - if boolean test is false for the first time
     * Have to make sure loop variable is being changed
     * Final value of mult3 = ... final value of i =
     */

  }
}
/*
 * Exercise 0
  1. Print numbers from 1 to 10.
  2. Print the square of each number in the range 1 to 5. (seperate)


  *
  *
  (Medium)Exercise 1: Sum of Even Numbers:
  Write a program that calculates the sum of all even numbers between 
  1 and a given positive integer (inclusive). Use a while loop to perform 
  the summation.

  (Hard)Exercise 2: FizzBuzz 
  Implement the FizzBuzz problem using a while loop. Print numbers from 1 
  to 100, but replace multiples of 3 with "Fizz" and multiples of 5 with 
  "Buzz." For numbers that are multiples of both 3 and 5, print "FizzBuzz."
 */
