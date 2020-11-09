package cz.osu.collections;

import cz.osu.interfaces.InventoryInterface;
import cz.osu.models.InventoryItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class InventoryOffspring extends ArrayList<InventoryItem> implements InventoryInterface {

    private int currentWeight = 0;


    @Override
    public boolean add(InventoryItem inventoryItem) {
        currentWeight += inventoryItem.getWeight();
        return super.add(inventoryItem);
    }


    @Override
    public int getCurrentWeight() {
        return currentWeight;
    }

    @Override
    public String info() {
        return null;
    }
}
