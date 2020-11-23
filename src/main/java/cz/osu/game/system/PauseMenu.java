package cz.osu.game.system;

import cz.osu.constants.GameConstants;
import cz.osu.model.AppModelSingleton;

public class PauseMenu {
    public static void printPauseMenu() {
        System.out.println(GameConstants.ANSI_CYAN + "╔════════════════ Pause menu ═══════════════╗" + GameConstants.ANSI_BLACK);
        System.out.print("  ");HudSystem.printHud();
        System.out.println("  " + AppModelSingleton.getInstance().getPlayer());
        System.out.println(GameConstants.ANSI_CYAN + "╚═══════════════════════════════════════════╝" + GameConstants.ANSI_BLACK);
    }
}
