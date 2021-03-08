package wizards;

public class Student extends Wizard {

  public Student(String name, int age) {
    super(name, age, "student");
  }

  @Override
  public void performMainActivity() {
    System.out.println("Student " + name + " is studying the art of magic");
  }

  @Override
  public void flyOnABroomstick() {
    super.flyOnABroomstick();
    System.out.println("I can play Quidditch and become a catcher");
  }
}
