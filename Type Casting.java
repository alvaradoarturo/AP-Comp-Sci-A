// One type can be cast to another compatible type if appropriate
// casting has precedence
public class DataTypes {

  public static void main(String[] args) {
    int total = 50;
    int n = 7;

    //double average = (double) total / n;
    double average = total / (double) n;

    /* Assigning an int to a double automatically casts the
       int to double        */
    int num = 5;
    double realNum = num;
    //
    double newNum = 7.5;
    int realNewNum = (int) (newNum + .5);

    double negNum = -4.2;
    int newNegNum = (int) (negNum - .5);
    System.out.println(newNegNum);
    System.out.println(realNewNum);
    //System.out.println(realNum);
    //System.out.println(average);

    // -----------------
    System.out.println((double) 5 / 7);
    System.out.println((int) 3.0 / 4);
    System.out.println((double) (3 / 4));

    // ------------------------
    System.out.println(8 % 3);
  }
}
