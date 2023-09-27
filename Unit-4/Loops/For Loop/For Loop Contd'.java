/**
    break: exit the loop prematurely, even if condition is still true
    // searches 
    continue: skip the current iteration of the loop
              and move to the next iteration
        - does not exit loop entirely
 */
public class Unit3Review {

  public static void main(String[] args) {
    // for (int i = 0; i <= 10; i++) {
    //   if (i == 5) {
    //     break; // exit the loop when i equal to 5
    //   }
    //   System.out.println(i);
    // }
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
        continue;
      }
      System.out.println(i);
    }
  }
}
/*
Warm Up:
Print out every even odd number from 1 to 100 until you get to n(input)


Exercise 1: Skipping Multiples
Write a program that prints the numbers from 1 to 100, but skips numbers
that are multiples of both 3 and 5. Use continue.

Exercise 4: Prime Number Checker
Write a program that uses a for loop to check if a given number is 
prime. Print a message indicating whether the number is prime or not.
*/
