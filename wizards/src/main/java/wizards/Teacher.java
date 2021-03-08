package wizards;

public class Teacher extends Wizard {

  public Teacher(String name, int age) {
    super(name, age, "teacher");
  }

  @Override
  public void performMainActivity() {
    System.out.println(this.profession + " " + name + " is teaching the art of magic");
  }
}
