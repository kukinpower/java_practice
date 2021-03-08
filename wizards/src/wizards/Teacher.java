package wizards;

public class Teacher extends Wizard{

  public Teacher(String name, int age) {
    super(name, age, "teacher");
  }

  @Override
  public void performMainActivity() {
    System.out.println("Teacher " + name + " is teaching the art of magic");
  }
}
