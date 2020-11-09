package cz.osu.collections;

import cz.osu.interfaces.InventoryInterface;
import cz.osu.models.InventoryItem;

import java.util.Arrays;

public class Register implements InventoryInterface {

    private InventoryItem[] items;
    private int lastIndex;
    private int currentWeight;

    public Register(int capacity) {
        this.items = new InventoryItem[capacity];
        lastIndex = 0;
        currentWeight = 0;
    }

    @Override
    public boolean add(InventoryItem item) {
        validateItemsBounds();

        items[lastIndex] = item;
        currentWeight += item.getWeight();
        lastIndex++;

        return true;
    }

    private void validateItemsBounds() {
        if (lastIndex == items.length)
            throw new ArrayIndexOutOfBoundsException("The array of InventoryItem objects is overflowed. You cannot add more items.");
    }

    @Override
    public int getCurrentWeight() {
        return currentWeight;
    }

    @Override
    public InventoryItem get(int index) {
        validateSearchIndexBounds(index);

        return items[index];
    }

    private void validateSearchIndexBounds(int index) {
        if (index < 0 || index >= items.length)
            throw new ArrayIndexOutOfBoundsException("Searched index is out of bounds of the array.");
    }

    @Override
    public String info() {
        return String.format("Inventory: [Inventory items: %s]", Arrays.toString(items));
    }
}
