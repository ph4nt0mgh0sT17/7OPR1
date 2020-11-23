package cz.osu.model;

public class CombatResult {
    private int playerHealthBalance;
    private int enemyHealthBalance;
    private boolean playerAlive;

    public CombatResult(int playerHealthBalance, int enemyHealthBalance, boolean playerAlive) {
        this.playerHealthBalance = playerHealthBalance;
        this.enemyHealthBalance = enemyHealthBalance;
        this.playerAlive = playerAlive;
    }

    public int getPlayerHealthBalance() {
        return playerHealthBalance;
    }

    public int getEnemyHealthBalance() {
        return enemyHealthBalance;
    }

    public boolean isPlayerAlive() {
        return playerAlive;
    }

    public void setPlayerHealthBalance(int playerHealthBalance) {
        this.playerHealthBalance = playerHealthBalance;
    }

    public void setEnemyHealthBalance(int enemyHealthBalance) {
        this.enemyHealthBalance = enemyHealthBalance;
    }

    public void setPlayerAlive(boolean playerAlive) {
        this.playerAlive = playerAlive;
    }
}
