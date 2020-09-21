package cz.osu;

public class Counter {
    protected int state;
    protected String name;

    public Counter(int state, String name) {
        this.state = state;
        this.name = name;
    }

    public void add() {
        add(1);
    }

    public void add(int number) {
        state += number;
    }

    public void remove() {
        remove(1);
    }

    public void remove(int number) {
        state -= number;
    }

    public void setZero() {
        state = 0;
    }

    @Override
    public String toString() {
        return "Counter: " + name + "; State: " + state;
    }
}
