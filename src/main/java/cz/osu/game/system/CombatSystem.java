package cz.osu.game.system;

import cz.osu.model.AppModelSingleton;
import cz.osu.model.CombatResult;
import cz.osu.model.Player;

import java.util.Random;

public class CombatSystem {
    public static CombatResult fight(Player enemy) {
        Player mainPlayer = AppModelSingleton.getInstance().getPlayer();
        Random random = new Random();

        CombatResult combatResult = new CombatResult(mainPlayer.getHealth(), enemy.getHealth(), mainPlayer.isAlive());

        boolean mainPlayerAttackFirst = random.nextBoolean();

        while (mainPlayer.isAlive() && enemy.isAlive()) {
            if (mainPlayerAttackFirst) {
                enemy.decreaseHealth(mainPlayer.getDamage());

                if (enemy.isAlive()) {
                    mainPlayer.decreaseHealth(enemy.getDamage());
                }
            }

            else {
                mainPlayer.decreaseHealth(enemy.getDamage());

                if (mainPlayer.isAlive()) {
                    enemy.decreaseHealth(mainPlayer.getDamage());
                }
            }
        }

        combatResult.setPlayerAlive(mainPlayer.isAlive());
        combatResult.setPlayerHealthBalance(mainPlayer.getHealth() - combatResult.getPlayerHealthBalance());
        combatResult.setEnemyHealthBalance(enemy.getHealth() - combatResult.getEnemyHealthBalance());

        return combatResult;
    }
}
