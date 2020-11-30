package cz.osu.models;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * The register of all {@link Payable} objects.
 */
public class Register implements Iterable<Payable> {
    private Payable[] array;
    private int top;

    /**
     * The default constructor that defines the size of the Register.
     * @param count The size of the register.
     */
    public Register(int count) {
        array = new Payable[count];
        top = -1;
    }

    /**
     * Gets the index of last added {@link Payable} object.
     * If the index is -1, the register is empty.
     *
     * @return The index.
     */
    public int getTop() {
        return top;
    }

    /**
     * Gets the size of the register.
     */
    public int getSize() {
        return array.length;
    }

    /**
     * Adds a {@link Payable} object into the register.
     * @param payable The {@link Payable} interface object.
     */
    public void add(Payable payable) {
        if ((top + 1) < array.length) {
            top++;
            array[top] = payable;
        }

        else {
            throw new IllegalArgumentException("The Register has been overflowed.");
        }
    }

    /**
     * Gets the {@link Payable} object from the regiter on given index.
     * If the index is out of bounds, exception is thrown.
     * @param index The index of the array.
     * @return The {@link Payable} object.
     */
    public Payable getPayable(int index) {
        validateIndex(index);
        return array[index];
    }

    /**
     * Validates given index.
     * @param index The given index number.
     */
    private void validateIndex(int index) {
        if (index < 0 || index >= array.length) {
            throw new IllegalArgumentException("The index is out of bounds of the Register.");
        }
    }

    /**
     * Public getter for the {@link Iterator}.
     * @return The {@link Iterator}.
     */
    public Iterator<Payable> iterator() {
        return new RegisterIterator();
    }

    /**
     * Local iterator for {@link Register} class.
     */
    class RegisterIterator implements Iterator<Payable> {

        private int index = 0;

        /**
         * Checks if there is any object left to search.
         * @return The boolean state.
         */
        @Override
        public boolean hasNext() {
            return index < getTop();
        }

        /**
         * Gets next {@link Payable} object from the {@link Register}.
         * @return The {@link Payable} object from the {@link Register}.
         */
        @Override
        public Payable next() {
            return getPayable(index++);
        }

        /**
         * Not implemented method.
         */
        @Override
        public void remove() {
            throw new UnsupportedOperationException("This operation is not supported.");
        }
    }
}
