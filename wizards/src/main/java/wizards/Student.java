package wizards;

public class Student extends Wizard {

  public Student(String name, int age) {
    super(name, age, "student");
  }

  @Override
  public void performMainActivity() {
    System.out.println(profession + " " + name + " is studying the art of magic");
  }

  @Override
  public void flyOnABroomstick() {
    super.flyOnABroomstick();
    System.out.println(this.name + ": \"I can play Quidditch and become a catcher\"");
  }
}
