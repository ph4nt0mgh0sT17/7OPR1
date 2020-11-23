package cz.osu.model;

import cz.osu.constants.GameConstants;

public class Player {
    private String name;
    private int health;
    private int damage;

    public Player(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public boolean isAlive() {
        return getHealth() > 0;
    }

    public void decreaseHealth(int damage) {
        setHealth(getHealth() - damage);

        if (getHealth() < 0)
            setHealth(0);
    }

    public void increaseHealth(int increasedHealth) {
        setHealth(getHealth() + damage);

        if (getHealth() > GameConstants.PLAYER_MAX_HEALTH)
            setHealth(GameConstants.PLAYER_MAX_HEALTH);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }
}
