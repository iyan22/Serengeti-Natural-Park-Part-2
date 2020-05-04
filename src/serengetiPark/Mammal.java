package serengetiPark;

public abstract class Mammal extends Specimen {

    // Constructors
    /**
     * This constructor, creates a Mammal object with the given attributes/values.
     * Creates the first GPS location on the day route.
     *
     * @param name       Name of the Specimen.
     * @param initialGPS Initial GPS location of the Specimen.
     */
    public Mammal(String name, GPS initialGPS) {
        super(name, initialGPS);
    }

}
