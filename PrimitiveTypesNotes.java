// Single line comments
// Another single line comment

/* block comments
 notes 
 even more notes
 even more more notes
 still notes
/*
Identifiers 
-------------------------
identifiers is a name for a variable, parameter, constant, user-defined 
method, user defined class
    - any sequence of letters, digits, and underscore
        - cant begin with a digit
        - case sensitive 
    - must communicate what is it 

    $Methods and variables are lowercase
    $Class name starts with uppercase letter 
 */

/*
Primative Data Types
------------------------------
    1. int | integer Ex: -2, 2 ,3000
        - bounded 
        - really large numbers will result in an overflow error
            - no warning, just wrong answer
    2. double | Floating point numbers 3.14, -23478.12, 1.6e4
    3. boolean | boolean. true or false
 */

/*
Declaration and initialization
------------------------------
    1. Variable is introduced with a declaration that specifies its type
    2. A variable is often initialized in its declaration
        Ex:
            int x;
            double y, z;
            boolean itsLit;
            int count = 1;
            double p = 2.3, q = 4.1
            ** Do arithmetic 
 */

public class DataTypes {

  public static void main(String[] args) {
    //int age;
    //int nextAge = age + 1;

    double secondsGiven = 120;
    double secondsToMinute = secondsGiven / 60;
    System.out.println(secondsToMinute);
    double secondsToHour = secondsGiven / 3600;
    System.out.println(secondsToHour);
  }
}
