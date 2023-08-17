import java.util.Scanner;

public class DataTypes {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("What will you get on this AP exam?: ");
    double classAvg = scanner.nextDouble();
    System.out.println("Your class average is: " + classAvg);

    scanner.nextLine();
    System.out.println("What is your name? ");
    String name = scanner.nextLine();
    System.out.println("Hi! " + name + " nice to meet you!");

    System.out.println("What day were you born on? ");
    int birthDate = scanner.nextInt();
    System.out.println("Ohh you were born on the " + birthDate + "? Me too!");

    System.out.println("Are you not entertained?");
    boolean isEntertained = scanner.nextBoolean();
    System.out.println("So it is " + isEntertained);
  }
}
/* Exercise 1: Triangle Area
-----------------------------------------------
   1. Prompt the user for base length of a triangle.
   2. Prompt the user for height of a triangle.
   3. Print out area of the triangle 
-----------------------------------------------

   Exercise 2: Distance Conversion

   1. Prompt the user for ditance in kilometers.
   2. Print out distance in miles.
-----------------------------------------------
   Exercise 3: Greeting Message
   1. Prompt the user for their name 
   2. Greet them with there name, and ask them for their age
   3. Using their name and age, create a greeting message.
 */
