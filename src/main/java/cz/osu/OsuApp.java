package cz.osu;


import cz.osu.constants.GameConstants;
import cz.osu.game.system.CombatSystem;
import cz.osu.game.system.HudSystem;
import cz.osu.game.system.PauseMenu;
import cz.osu.model.AppModelSingleton;
import cz.osu.model.CombatResult;
import cz.osu.model.Player;

public class OsuApp {

    public static void main(String[] args) {
        HudSystem.printHud();
        CombatResult result = CombatSystem.fight(new Player("Striga", 100, 15));
        System.out.println("Enemy is dealt damage: " + Math.abs(result.getEnemyHealthBalance()));
        System.out.println("Player is dealt damage: " + Math.abs(result.getPlayerHealthBalance()));

        PauseMenu.printPauseMenu();

    }
}
