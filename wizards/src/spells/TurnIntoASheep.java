package RomanKukin_HW1.spells;

public class TurnIntoASheep extends Spell implements Polymorphable{

  @Override
  public void polymorph(String target) {
    System.out.println("Wow! " + target + " turned into a sheep");
  }

  @Override
  public void apply(String target) {
    polymorph(target);
  }
}
