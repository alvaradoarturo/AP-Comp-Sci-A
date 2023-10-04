/*
    Comparing Objects Part 2 10/4/23:

 */
import java.util.Scanner;

public class Unit3Review {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String className = scanner.nextLine();
    int vowelCnt = 0;
    // String className2 = className;
    // String className3 = "computer science";
    // System.out.println(className2 == className);
    // System.out.println(className2 == className3);

    // comapring chars : use single quotes
    // single quotes can only contain 1 char
    System.out.println(className.charAt(0) == 'a');

    for (int i = 0; i <= className.length() - 1; i++) {
      if (className.charAt(i) == 'a') {
        vowelCnt++;
      }
    }
    System.out.println(vowelCnt);

    String mainString = scanner.nextLine();
    String subString = "ime";

    for (int i = 0; i <= mainString.length() - subString.length(); i++) {
      if (mainString.substring(i, i + subString.length()).equals(subString)) {
        System.out.println("Found");
        break;
      }
    }

    scanner.close();
  }
}
/*
    
    Exercise Warm Up: 5. Number Pattern:
    Write a program that prints a number pattern where each 
    row contains a series of numbers from 1 to the row number. 
    Use nested for loops to achieve this.
    Example:

    Enter the number of rows: 5
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5

    Exercise 1: Count Vowels in a String
    Write a Java program that counts the number of vowels 
    (a, e, i, o, u) in a given string using a for loop.


    Exercise 2:  Find Substring
    Write a Java program that checks if a given substring exists 
    in a larger string using a for loop.
 */
