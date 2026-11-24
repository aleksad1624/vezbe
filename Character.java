package rpg.arena;

public class Character {
	
	private String name;
    private int health;
    private int baseDmg;

    // Podrazumevani konstruktor
    public Character() {
        this("Character", 100, 10);
    }

    public Character(String name, int health, int baseDmg) {
        this.name = name;
        this.health = health;
        this.baseDmg = baseDmg;
    }

    // Get metode
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getBaseDmg() {
        return baseDmg;
    }

    // Set metode
    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setBaseDmg(int baseDmg) {
        this.baseDmg = baseDmg;
    }

    // Pomocna metoda za napad
    protected void performAttack(Character defender, double chance) {

        if (Math.random() < chance) {
            System.out.println(name + " attacks " + defender.getName()
                    + " for " + baseDmg + " damage!");

            defender.takeDamage(baseDmg);
        } else {
            System.out.println(name + " missed the attack!");
        }

        if (defender.isAlive()) {
            defender.retaliate(this);
        }
    }

    // Napad sa sansom od 75%
    public void attack(Character defender) {
        performAttack(defender, 0.75);
    }

    // Smanjivanje health vrednosti
    public void takeDamage(int damage) {
        health -= damage;

        if (health < 0) {
            health = 0;
        }

        System.out.println(name + " has " + health + " HP left.");
    }

    // Provera da li je karakter ziv
    public boolean isAlive() {
        return health > 0;
    }

    // Pomocna metoda za kontranapad
    protected void performRetaliate(Character attacker, double chance) {

        if (Math.random() < chance) {
            System.out.println(name + " counterattacks "
                    + attacker.getName() + " for " + baseDmg + " damage!");

            attacker.takeDamage(baseDmg);
        } else {
            System.out.println(name + " failed to counterattack!");
        }
    }

    // Kontranapad sa sansom od 60%
    public void retaliate(Character attacker) {
        performRetaliate(attacker, 0.60);
    }
}