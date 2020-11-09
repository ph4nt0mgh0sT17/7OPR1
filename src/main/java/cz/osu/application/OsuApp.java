package cz.osu.application;

import cz.osu.collections.Register;
import cz.osu.interfaces.InventoryInterface;
import cz.osu.models.Food;
import cz.osu.models.InventoryItem;
import cz.osu.models.Weapon;
import cz.osu.utils.console.IntroductionDisplayer;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OsuApp {

    public static void main(String[] args) {
        log.info("The application has started!");

        System.out.println(IntroductionDisplayer.renderIntroduction());

        InventoryItem inventoryItem = new InventoryItem("Aerondight",5);
        Food food = new Food("Bread", 1, 25);
        Weapon weapon = new Weapon("Aerondight", 5, 150);

        System.out.println(inventoryItem);
        System.out.println(food);
        System.out.println(weapon);

        InventoryInterface inventory = new Register(20);
        inventory.add(inventoryItem);
        inventory.add(food);
        inventory.add(weapon);

        System.out.println(inventory.info());

        log.info("The application has exited!");
    }
}
