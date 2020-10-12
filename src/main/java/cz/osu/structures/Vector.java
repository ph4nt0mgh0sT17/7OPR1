package cz.osu.structures;

import java.util.Arrays;

/**
 * The class representing the simple Vector in the Math.
 */
public class Vector {

    private int[] items;

    public Vector(int size) {
        items = new int[size];
    }

    public int getSize() {
        return items.length;
    }

    /**
     * Sets the vector item at given index with given value.
     * If the index is out of bounds of the {@link Vector} an {@link ArrayIndexOutOfBoundsException} is thrown.
     * @param index The index that identifies the item in the {@link Vector}.
     * @param value The value that will replace the default value.
     */
    public void setVectorItem(int index, int value) {
        if (!isIndexValid(index)) {
            throw new ArrayIndexOutOfBoundsException(String.format("The index %d is not in the bounds of the Vector.", index));
        }

        items[index] = value;
    }

    /**
     * Gets the vector item at given index.
     * @param index
     * @return The item at given index. If index is out of bounds the {@link Integer#MIN_VALUE} is returned.
     */
    public int getVectorItem(int index) {
        if (isIndexValid(index)) {
            return items[index];
        }

        return Integer.MIN_VALUE;
    }

    /**
     * Checks if given index is valid in current {@link Vector}.
     * @param index The given index of the item in the {@link Vector}.
     * @return The state if the index is really valid.
     */
    private boolean isIndexValid(int index) {
        return index >= 0 && index < items.length;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "items=" + Arrays.toString(items) +
                '}';
    }
}
