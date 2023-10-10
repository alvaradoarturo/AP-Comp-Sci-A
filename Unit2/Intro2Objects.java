class Person {

  // variables
  private String name; // nothing -> public -> private
  private int grade;

  // 2nd make them both private and try to print

  //2nd
  public void setName(String name) {
    this.name = name;
  }

  //2nd
  public void setGrade(int grade) {
    this.grade = grade;
  }

  public void printStudentInfo() {
    System.out.println(this.name + " " + grade + "th grade");
  }

  private int getSum(int grade) {
    return 7;
  }

  public int returnSomethingElse(int grade) {
    return getSum(grade) + 3;
  }
}

public class Unit3Review {

  public static void main(String[] args) {
    Student student1 = new Student();
    Student student2 = new Student();
    student2.setGrade(12);
    student2.setName("Art");
    student1.setName("Art");
    student1.setGrade(10);
    student1.printStudentInfo();
    System.out.println(student1.returnSomethingElse(0));
    student2.printStudentInfo();
    Student student2 = new Student();
  }
}
