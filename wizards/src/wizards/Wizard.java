package wizards;

import spells.Spell;

public abstract class Wizard implements BroomstickFlyable, PotionMakeable, Comparable<Wizard> {
  protected final String name;
  protected final int age;
  protected final String profession;

  public Wizard(String name, int age, String profession) {
    this.name = name;
    this.age = age;
    this.profession = profession;
  }

  public void castASpell(Spell spell, String target) {
    System.out.println(name + ": performs a spell on the " + target + ": ");
    spell.apply(target);
  }

  public void introduce() {
    System.out.println(name + ": \"Hello! My name is " + name +
        ". I'm a " + profession + ". And I'm " + age + " years old.");
  }

  public abstract void performMainActivity();

  @Override
  public void flyOnABroomstick() {
    System.out.println("Whoo, " + name + " is flying on a broomstick");
  }

  @Override
  public void makePotion(String potion) {
    System.out.println(name + ": is making a potion: ");
    System.out.println("...add some bean juice, stir twice clockwise and " + potion + " is ready");
  }

  @Override
  public String toString() {
    return "Wizard: " +
        "name='" + name + '\'' +
        ", age=" + age +
        ", profession=" + profession;
  }

  @Override
  public int compareTo(Wizard o) {
    return this.profession.compareTo(o.profession);
  }

}
