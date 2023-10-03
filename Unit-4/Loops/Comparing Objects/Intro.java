/*
Comparing Objects
Different than comparing regular variables like ints and doubles
    - use == or != 
Objects you use .equals method which we've already use 
 */
import java.util.Scanner;

public class Unit3Review {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // String name = scanner.nextLine();
    String name = new String("Alvarado");
    String name2 = "Alvarado";
    System.out.println(name.equals(name2));
    // toUpperCase()
    System.out.println(name2.toUpperCase());
    // toLowerCase()
    System.out.println(name2.toLowerCase());
    System.out.println(name.equalsIgnoreCase(name2));

    // Substring
    /*
     Alvarado
     varado
     substring(beginIndex) // 1 paramter for starting index
     substring (beginIndex, endIndex) starting point and ending exclusive 
     */
    System.out.println(name2.substring(4));
    System.out.println(name2.substring(2, 7));
    // Length
    System.out.println(name2.length());
    System.out.println("alvarado".length());
    System.out.println("".length());
    System.out.println(" ".length());
    System.out.println(name2.charAt(0));
    System.out.println(name2.charAt(name2.length() - 1));

    // Looping over a string
    for (int i = 0; i <= name2.length() - 1; i++) {
      System.out.println(name2.charAt(i));
    }
    // print it backwards
  }
}
// Exercise 0
// Ask the user for two strings, if the string are the same (case sensitive)
// print 'Equals!'
/*
   If they are exactly the same but still same? (case insensitive) print 
   "almost my boy"
   Otherwise print "nah"
 */
// Exercise 1
// Ask the user for two strings, if the last and first letter are the same
// print "the last and first letter are the same";
/*
Exercise 1: Reverse a String
Write a Java program that takes a string as input and prints the reverse 
of that string using a for loop.

Exercise 2: Count vowels in a string
Write a Java program that counts the number of vowels 
(a, e, i, o, u) in a given string using a for loop.
 */
