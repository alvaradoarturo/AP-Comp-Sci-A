/*
Importance of Functions
-----------------------
1. Reusability (DRY)
2. Modularization
Definition : reusable block of code that performs a specific task
  ex: println(), nextInt(), etc
3. SRP

return_type function_name(parameter1_type parameter1_name, parameter2_type parameter2_name, ...) {
    // Function body
    // Code goes here
    return return_value; // Optional
}
 */

public class DataTypes {

  public static void main(String[] args) {
    int num1 = 6;
    int num2 = 10;
    //int sum = getSum(num1, num2);
    System.out.println(getSum(num1, num2));
    System.out.println(getProduct(num1, num2));
    System.out.println(getAverage(num1, num2));
    --------------------------------------
    int x = 7;
    int y = 5;
    int z = 3;
    System.out.println(triangleType(x, y, z));
  }

  static int getSum(int num1, int num2) {
    return num1 + num2;
  }

  // give me a function that returns product
  static int getProduct(int num1, int num2) {
    return num1 * num2;
  }

  // give me a function that return the average
  static double getAverage(int num1, int num2) {
    return ((double) num1 + num2) / 2;
  }

  static String triangleType(int x, int y, int z) {
    if (isValidTriangle(x, y, z)) {
      if (x == y && y == z && z == x) {
        return "Equilateral";
      } else if (x == y || y == z || z == x) {
        return "Isosceles";
      } else {
        return "Scalene";
      }
    } else {
      return "Not a triangle";
    }
  }

  static boolean isValidTriangle(int x, int y, int z) {
    if (x + y > z && x + z > y && y + z > x) {
      return true;
    } else {
      return false;
    }
  }
}
/*
Write a Java function called triangleType that takes 
three integers as parameters representing the lengths 
of three sides of a triangle. The function should return 
a string indicating the type of triangle:

"Equilateral" if all sides are equal.
"Isosceles" if two sides are equal.
"Scalene" if all sides are different.
"Not a triangle" if the given side lengths cannot form a valid triangle.
 */
