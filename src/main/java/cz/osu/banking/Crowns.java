package cz.osu.banking;

public class Crowns {

    private long hallers;
    private static final int HELLERS_TO_CROWN = 100;

    public Crowns(double crowns) {
        hallers = Math.round(crowns * HELLERS_TO_CROWN);
    }

    public Crowns(Crowns crowns) {
        hallers = crowns.getHallers();
    }

    public long getHallers() {
        return hallers;
    }

    public long getCrowns() {
        return getHallers() / HELLERS_TO_CROWN;
    }

    public long getRemainingHallers() {
        return getHallers() % HELLERS_TO_CROWN;
    }

    public void print() {
        System.out.println(toString());
    }

    public Crowns plus(Crowns crowns) {
        return new Crowns((double) (getHallers() + crowns.getHallers()) / HELLERS_TO_CROWN);
    }

    public Crowns plus(double crowns) {
        return plus(new Crowns(crowns));
    }

    public Crowns minus(Crowns crowns) {
        return new Crowns((double) (getHallers() - crowns.getHallers()) / HELLERS_TO_CROWN);
    }

    public Crowns minus(double crowns) {
        return minus(new Crowns(crowns));
    }

    public Crowns multiply(double crowns) {
        return new Crowns((double) (Math.round(getHallers() * crowns)) / HELLERS_TO_CROWN);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("");
        if (getCrowns() == 0 && getHallers() < 0) {
            stringBuilder.append('-');
        }

        stringBuilder.append(getCrowns());
        stringBuilder.append(',');

        long remainingHellers = Math.abs(getRemainingHallers());
        if (remainingHellers == 0) {
            stringBuilder.append("00");
        }

        else {
            if (remainingHellers < 10) {
                stringBuilder.append('0');
            }
            stringBuilder.append(remainingHellers);
        }
        stringBuilder.append(" CZK");
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (!object.getClass().equals(getClass())) {
            return false;
        }

        Crowns crowns = (Crowns)object;
        return getHallers() == crowns.getHallers();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + (int) (this.hallers ^ (this.hallers >>> 32));
        return hash;
    }
}
