package cz.osu.models;

public class Address {

    private State state;
    private String city;
    private String street;
    private int houseNumber;

    public Address(State state, String city, String street, int houseNumber) {
        this.state = state;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public Address(Address address) {
        city = address.getCity();
        street = address.getStreet();
        houseNumber = address.getHouseNumber();
        state = new State(address.getState());
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Address {\n\t\t");
        sb.append("state = ").append(state).append(",\n\t\t");
        sb.append("city='").append(city).append('\'').append(",\n\t\t");
        sb.append("street='").append(street).append('\'').append(",\n\t\t");
        sb.append("houseNumber=").append(houseNumber).append("\n\t");
        sb.append('}');
        return sb.toString();
    }
}
