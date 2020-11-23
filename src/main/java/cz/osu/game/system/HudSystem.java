package cz.osu.game.system;

import cz.osu.constants.GameConstants;
import cz.osu.model.AppModelSingleton;

public class HudSystem {
    public static void printHud() {
        int currentHealth = AppModelSingleton.getInstance().getPlayer().getHealth();
        int normalizedHealth = (int)(currentHealth / 10);
        StringBuilder healthBar = new StringBuilder();
        for (int i = 0; i < normalizedHealth; i++) {
            healthBar.append(GameConstants.HEALTH_BAR_SYMBOL);
        }

        for (int i = 0; i < 10 - normalizedHealth; i++) {
            healthBar.append(GameConstants.EMPTY_HEALTH_BAR_SYMBOL);
        }

        System.out.println(GameConstants.ANSI_BLACK + "Health: " + GameConstants.ANSI_RED + healthBar.toString() + GameConstants.ANSI_BLACK);
    }
}
