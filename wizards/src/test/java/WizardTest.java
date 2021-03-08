import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import spells.Reparo;
import spells.TurnIntoASheep;
import wizards.Student;
import wizards.Teacher;
import wizards.Wizard;

public class WizardTest {

  private ByteArrayOutputStream output = new ByteArrayOutputStream();

  @Before
  public void setUpStreams() {
    System.setOut(new PrintStream(output));
  }

  @After
  public void cleanUpStreams() {
    System.setOut(null);
  }

  @Test
  public void teacherPerformMainActivity() {
    Wizard albus = new Teacher("Albus Dumbledore", 110);
    albus.performMainActivity();

    assertEquals(albus.getProfession() + " " + albus.getName() + " is teaching the art of magic",
        output.toString().trim());
  }

  @Test
  public void studentPerformMainActivity() {
    Wizard harry = new Student("Harry Potter", 17);
    harry.performMainActivity();

    assertEquals(harry.getProfession() + " " + harry.getName() + " is studying the art of magic",
        output.toString().trim());
  }

  @Test
  public void teacherIntroduce() {
    Wizard albus = new Teacher("Albus Dumbledore", 110);
    albus.introduce();

    assertEquals(albus.getName() + ": \"Hello! My name is " + albus.getName() +
            ". I'm a " + albus.getProfession() + ". And I'm " + albus.getAge() + " years old.\"",
        output.toString().trim());
  }

  @Test
  public void wizardCastTurnIntoASheep() {
    Wizard albus = new Teacher("Albus Dumbledore", 110);
    String target = "badass";
    albus.castASpell(new TurnIntoASheep(), target);

    assertEquals(albus.getName() + ": performs a spell on the " + target + ": \nWow! " + target + " turned into a sheep",
        output.toString().trim());
  }

  @Test
  public void wizardCastReparo() {
    Wizard hermione = new Student("Hermione Granger", 17);
    String target = "glasses";

    hermione.castASpell(new Reparo(), "glasses");

    assertEquals(hermione.getName() + ": performs a spell on the " + target + ": \n" + target + " reparo!",
        output.toString().trim());
  }

  @Test
  public void studentIntroduce() {
    Wizard hermione = new Student("Hermione Granger", 17);
    hermione.introduce();

    assertEquals(hermione.getName() + ": \"Hello! My name is " + hermione.getName() +
            ". I'm a " + hermione.getProfession() + ". And I'm " + hermione.getAge() + " years old.\"",
        output.toString().trim());
  }

  @Test
  public void broomstickFlyingTimeTest() {
    Wizard harry = new Student("Harry Potter", 17);
    harry.broomstickFlyingTime();

    assertEquals("It's time to practice flying!",
        output.toString().trim());
  }

  @Test
  public void studentFlyOnABroomstick() {
    Wizard harry = new Student("Harry Potter", 17);
    harry.flyOnABroomstick();

    assertEquals("Whoo, " + harry.getName() + " is flying on a broomstick\n" +
        harry.getName() + ": \"I can play Quidditch and become a catcher\"",
        output.toString().trim());
  }

  @Test
  public void teacherFlyOnABroomstick() {
    Wizard albus = new Teacher("Albus Dumbledore", 110);
    albus.flyOnABroomstick();

    assertEquals("Whoo, " + albus.getName() + " is flying on a broomstick",
        output.toString().trim());
  }

  @Test
  public void potionMakingTimeTest() {
    Wizard harry = new Student("Harry Potter", 17);
    harry.potionMakingTime();

    assertEquals("It's time to make some potions!",
        output.toString().trim());
  }

  @Test
  public void makePotionTest() {
    Wizard harry = new Student("Harry Potter", 17);
    String potion = "felix felicis";
    harry.makePotion(potion);

    assertEquals(harry.getName() + ": is making a potion: \n...add some bean juice, stir twice clockwise and " + potion + " is ready",
        output.toString().trim());
  }

  @Test
  public void sortByNaturalOrdering() {
    Wizard harry = new Student("Harry Potter", 17);
    Wizard hermione = new Student("Hermione Granger", 17);
    Wizard albus = new Teacher("Albus Dumbledore", 110);

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

    assertEquals(new ArrayList<Wizard>(Arrays.asList(albus, harry, hermione)), wizards1);
  }

  @Test
  public void sortByAge() {
    Wizard harry = new Student("Harry Potter", 17);
    Wizard hermione = new Student("Hermione Granger", 17);
    Wizard albus = new Teacher("Albus Dumbledore", 110);
    List<Wizard> wizards2 = new ArrayList<>();

    wizards2.add(albus);
    wizards2.add(harry);
    wizards2.add(hermione);

    Comparator<Wizard> ageComparator = new Comparator<Wizard>() {
      @Override
      public int compare(Wizard o1, Wizard o2) {
        if (o1 == null && o2 == null) {
          return 0;
        }
        if (o1 == null) {
          return -1;
        }
        if (o2 == null) {
          return 1;
        }
        return o1.getAge() - o2.getAge();
      }
    };

    Collections.sort(wizards2, ageComparator);
    System.out.println("Sort wizards2 by age comparison:");
    for (Wizard wizard : wizards2) {
      System.out.println(wizard);
    }
    assertEquals(new ArrayList<Wizard>(Arrays.asList(harry, hermione, albus)), wizards2);
  }
}
