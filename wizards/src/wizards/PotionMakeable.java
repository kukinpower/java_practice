package wizards;

interface PotionMakeable {
  void makePotion(String potion);

  default void potionMakingTime() {
    System.out.println("It's time to make some potions");
  }
}
