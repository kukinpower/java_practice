package RomanKukin_HW1.spells;

public class Reparo extends Spell implements Repairable {

  @Override
  public void repair(String target) {
    System.out.println(target + " reparo!");
  }

  @Override
  public void apply(String target) {
    repair(target);
  }
}
