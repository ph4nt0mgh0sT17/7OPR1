package cz.osu.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    public void createPlayerInstance() {
        Player player = new Player("David", 100, 20);

        int expectedHealth = 100;
        int expectedDamage = 20;

        assertNotNull(player);
        assertEquals(expectedHealth, player.getHealth());
        assertEquals(expectedDamage, player.getDamage());
    }
}