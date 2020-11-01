package cz.osu.models;

public class Address {
    private String state;
    private String city;
    private String street;
    private int zip;

    /**
     * Constructs an {@link Address}.
     * @param state The state of the address.
     * @param city The city of the address.
     * @param street The street of the address.
     * @param zip The integere value of zip code.
     */
    public Address(String state, String city, String street, int zip) {
        this.state = state;
        this.city = city;
        this.street = street;
        this.zip = zip;
    }

    /**
     * Constructs an address from another address. Copy-Constructor
     * @param address Already created instance of the {@link Address}.
     */
    public Address(Address address) {
        this.state = address.getState();
        this.city = address.getCity();
        this.street = address.getStreet();
        this.zip = address.getZip();
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getZip() {
        return zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "state='" + getState() + '\'' +
                ", city='" + getCity() + '\'' +
                ", street='" + getStreet() + '\'' +
                ", zip=" + getZip() +
                '}';
    }
}
