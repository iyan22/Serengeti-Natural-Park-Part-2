package serengetiPark;

public class Carnivorous extends Mammal {

    // Constructors
    /**
     * This constructor, creates a Carnivorous object with the given attributes/values.
     * Creates the first GPS location on the day route.
     *
     * @param name       Name of the Carnivorous.
     * @param initialGPS Initial GPS location of the Carnivorous.
     */
    public Carnivorous(String name, GPS initialGPS) {
        super(name, initialGPS);
    }
}
