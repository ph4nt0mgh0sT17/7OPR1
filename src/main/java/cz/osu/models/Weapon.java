package cz.osu.models;

public class Weapon extends InventoryItem {
    private int damage;

    public Weapon(String name, int weight, int damage) {
        super(name, weight);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        String baseToString = super.toString();

        return String.format("%s, Weapon: [Damage: %d HP]]", baseToString.substring(0, baseToString.length() - 1), getDamage());
    }
}
