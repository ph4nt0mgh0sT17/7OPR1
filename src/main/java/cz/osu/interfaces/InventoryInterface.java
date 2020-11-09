package cz.osu.interfaces;

import cz.osu.models.InventoryItem;

public interface InventoryInterface {
    boolean add(InventoryItem item);
    int getCurrentWeight();
    InventoryItem get(int index);
    public String info();
}
