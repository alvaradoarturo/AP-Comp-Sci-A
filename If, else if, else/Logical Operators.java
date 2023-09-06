/*
      Logical Operators (returns a boolean result) 
      ----------------
      1. &&   AND
      2. ||   OR
      3. !    NOT
      Logical operators are used to form compound boolean expressions
        - Evaluate to true or false

      &&| T F          || ! T F         !|  
      --              ----              --
      T   T F         T     T T         T      F
      F   F F         F     T F         F      T

      - Subexpressions in a compound boolean expression are evaluated from left to right
      - Evaluation automatically stops as soon as the value of the entire expression is
        known
     */

import java.util.Scanner;

public class DataTypes {

  static int age = 18;

  public static void main(String[] args) {
    int num1, num2, num3;
    num1 = num2 = num3 = 5;
    int num4 = 0;
    //int age = 18;
    boolean a = true;
    boolean b = false;
    checkEnrollment(age, a, b);

    System.out.println(num1 > 5 && num2 * 2 > 9);
    System.out.println(num1 > 5 || num2 * 2 > 9);
    System.out.println(num1 > 5 && num2 * 2 > 9 || num3 - 1 > 6);
    System.out.println(num1 > 5 && num2 * 2 > 9 || !(num3 - 1 > 6));
    System.out.println(!(num1 > 5 || num2 * 2 > 9));
    System.out.println(5 > 7 || 6 == 6.0 && !false || 1 < 0);
    System.out.println(5 < 5 && 5 / 0 > 1);
    //System.out.println(5 <= 5 && 5 / 0 > 1);
    System.out.println(age);
    //checkEnrollment(age, a, b);
  }

  static void checkEnrollment(
    int age1,
    boolean isGraduated,
    boolean isClassFull
  ) {
    //age++;
    if (age1 >= 18 && isGraduated && !isClassFull) {
      System.out.println("You can enroll");
    } else {
      System.out.println("No space");
    }
  }
}
/* 9/6/23
Write a Java program that checks whether a student is eligible for enrollment 
in a course based on the following criteria:

    -The student must be at least 18 years old.

    -The student must have completed high school (represented as a 
     boolean value hasHighSchoolDiploma).
    
    - The course must not be full (represented as a boolean 
      value isCourseFull).

The program should prompt the user for the student's age and whether they have 
a high school diploma and whether the course is full. Then determine and display 
whether the student is eligible for enrollment.
 */
