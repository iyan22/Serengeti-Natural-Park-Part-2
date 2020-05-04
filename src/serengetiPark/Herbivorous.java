package serengetiPark;

public class Herbivorous extends Mammal {

    // Constructors
    /**
     * This constructor, creates a Herbivorous object with the given attributes/values.
     * Creates the first GPS location on the day route.
     *
     * @param name       Name of the Herbivorous.
     * @param initialGPS Initial GPS location of the Herbivorous.
     */
    public Herbivorous(String name, GPS initialGPS) {
        super(name, initialGPS);
    }


}
