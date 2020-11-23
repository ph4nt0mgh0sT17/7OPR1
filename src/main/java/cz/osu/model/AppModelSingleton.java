package cz.osu.model;

import cz.osu.constants.GameConstants;

public class AppModelSingleton {
    private static AppModelSingleton instance;

    private Player player;

    private AppModelSingleton() {
        player = new Player(GameConstants.PLAYER_NAME, GameConstants.PLAYER_MAX_HEALTH, GameConstants.PLAYER_DAMAGE);
    }

    public static AppModelSingleton getInstance() {
        if (instance == null)
            instance = new AppModelSingleton();

        return instance;
    }

    public Player getPlayer() {
        return player;
    }
}
