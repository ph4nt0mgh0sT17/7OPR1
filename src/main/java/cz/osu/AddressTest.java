package cz.osu;

import cz.osu.models.Address;
import cz.osu.models.State;

public class AddressTest {
    public static void main(String[] args) {
        Address a1 = new Address(new State("Czech Republic","CZE"),"Ostrava", "Celni", 668);
        Address a2 = new Address(a1);

        System.out.println(a1);
        System.out.println(a2);


        System.out.println("\n===========================================================\n");
        a1.setCity("Opava");
        a1.getState().setName("Czechia");

        System.out.println(a1);
        System.out.println(a2);
    }
}
