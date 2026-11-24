package rpg.arena;

public class Warrior extends Character {

	public Warrior() {
        this("Warrior");
    }

    public Warrior(String name) {
        super(name, 50, 8);
    }

    @Override
    public void attack(Character defender) {
        performAttack(defender, 0.85);
    }

    @Override
    public void takeDamage(int damage) {
        int reducedDamage = (int) Math.ceil(damage * 0.80);

        System.out.println(getName() + "'s armor reduces damage!");

        super.takeDamage(reducedDamage);
    }
}

