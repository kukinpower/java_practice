package wizards;

interface BroomstickFlyable {
  void flyOnABroomstick();

  default void broomstickFlyingTime() {
    System.out.println("It's time to practice flying!");
  }
}
