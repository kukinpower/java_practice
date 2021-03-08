package RomanKukin_HW1.wizards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import RomanKukin_HW1.spells.Reparo;
import RomanKukin_HW1.spells.TurnIntoASheep;

public class Test {
  public static void main(String[] args) {
    Wizard harry = new Student("Harry Potter", 17);
    Wizard hermione = new Student("Hermione Granger", 17);
    Wizard albus = new Teacher("Albus Dumbledore", 110);

    hermione.performMainActivity();
    albus.performMainActivity();
    System.out.println();

    albus.introduce();
    albus.castASpell(new TurnIntoASheep(), "badass");
    System.out.println();

    harry.broomstickFlyingTime();
    harry.flyOnABroomstick();
    harry.introduce();
    harry.potionMakingTime();
    harry.makePotion("felix felicis");
    System.out.println();

    hermione.introduce();
    hermione.castASpell(new Reparo(), "glasses");

    List<Wizard> wizards1 = new ArrayList<>();
    wizards1.add(albus);
    wizards1.add(harry);
    wizards1.add(hermione);
    wizards1.sort(Collections.reverseOrder());

    System.out.println();
    System.out.println("Sort wizards1 by natural ordering:");
    for (Wizard wizard : wizards1) {
      System.out.println(wizard);
    }
    System.out.println();

    List<Wizard> wizards2 = new ArrayList<>();
    wizards2.add(albus);
    wizards2.add(harry);
    wizards2.add(hermione);

    Comparator<Wizard> ageComparator = new Comparator<Wizard>() {
      @Override
      public int compare(Wizard o1, Wizard o2) {
        return o1.age - o2.age;
      }
    };

    Collections.sort(wizards2, ageComparator);
    System.out.println("Sort wizards2 by age comparison:");
    for (Wizard wizard : wizards2) {
      System.out.println(wizard);
    }

  }
}
