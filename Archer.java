package rpg.arena;

public class Archer extends Character {

	public Archer() {
        this("Archer");
    }

    public Archer(String name) {
        super(name, 40, 10);
    }

    @Override
    public void retaliate(Character attacker) {
        performRetaliate(attacker, 0.70);
    }
}

