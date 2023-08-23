// Review type casting

// Remaining Operator % => mod(remainder)
// Point: Precedence in order of operation;
public class DataTypes {

  public static void main(String[] args) {
    System.out.println((double) (7 / 2));
    int bigNumber = 50;
    //              51
    //System.out.println(bigNumber % 5);
    //                               4
    //                               3
    // remainder can be 0 or 1

    double anotherNumber = 20.0;
    //                   = 20.5
    //System.out.println(anotherNumber % 2.0);
    //                                 2.5
    //                                 2.1
    // PRECEDENCE
    //System.out.println(5 % 2 + 1);
    //                3 * 5 % 2 + 1 * 3

    //System.out.println(22 / 7.0);
    double amount = 100.0;
    System.out.println(amount > 99.995);
  }
}
/* Relational Operators 
-----------------------------------
  1. == equal to
  2. != not equal to 
  3. > greater than
  4. < less than
  5. >= greater than or equal to 
  6. <= less than or equal to
  
  1. == equal to 
    - camparison operator
    - boolean isAClass = classSize == 27;
    System.out.println(27 == 27);
 */
