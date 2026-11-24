package rpg.arena;

public class Mage extends Character {

	public Mage() {
        this("Mage");
    }

    public Mage(String name) {
        super(name, 30, 15);
    }

    @Override
    public void attack(Character defender) {
        performAttack(defender, 0.65);
    }

    @Override
    public void retaliate(Character attacker) {
        performRetaliate(attacker, 0.65);
    }
}

