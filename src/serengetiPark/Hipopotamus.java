package serengetiPark;

public class Hipopotamus extends Herbivorous {

    // Constructors
    /**
     * This constructor, creates a Hipopotamus object with the given attributes/values.
     * Creates the first GPS location on the day route.
     *
     * @param name       Name of the Hipopotamus.
     * @param initialGPS Initial GPS location of the Hipopotamus.
     */
    public Hipopotamus(String name, GPS initialGPS) {
        super(name, initialGPS);
    }

}
