/*
Nested for loops:
Introduction:
    - One loop inside another
    - Explain the concept of "outer loop" and in "inner loop"
Importance:
    - Handling multidomensional data structures: matrices or 2D arrays
    - Data Processing 
Run Time: 

 */
/**
 * Unit3Review
 */
import java.util.Scanner;

public class Unit3Review {

  public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);
    // int n = scanner.nextInt();
    // Print a multiplication table 1s to 10s
    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= 10; j++) {
        System.out.print(i * j + " ");
      }
      System.out.print("\n");
    }
    // Print it backwords
    for (int i = 10; i >= 1; i--) {
      for (int j = 10; j >= 1; j--) {
        System.out.print(i * j + " ");
      }
      System.out.print("\n");
    }
    // Importance
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println("");
    }
  }
}
/*
Exercise 0:
Write a program that prints a number pattern where each row contains a series of numbers
from 1 to the row number. Use nested for loops to achieve this.

Ex: Enter the number of rows: 5
1 
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */
