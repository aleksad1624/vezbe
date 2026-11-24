package rpg.arena;

public class Main {

	public static void main(String[] args) {
		
		Character warrior = new Warrior("John Snow");
        Character mage = new Mage("Night King");

        System.out.println(" RPG ARENA ");
        System.out.println(warrior.getName() + " againts " + mage.getName());

        int round = 1;

        while (warrior.isAlive() && mage.isAlive()) {

            System.out.println(" ROUND " + round + " ");

            warrior.attack(mage);

            if (mage.isAlive() && warrior.isAlive()) {
                mage.attack(warrior);
            }

            round++;
        }

        System.out.println(" FIGHT OVER ");

        if (warrior.isAlive()) {
            System.out.println("Winner: " + warrior.getName());
            System.out.println("Kill the boy, and let the man be born");
        } else if (mage.isAlive()) {
            System.out.println("Winner: " + mage.getName());
        } else {
            System.out.println("Draw!");
        }
    }
}
