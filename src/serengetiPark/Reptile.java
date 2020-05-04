package serengetiPark;

public abstract class Reptile extends Specimen {

    // Constructors
    /**
     * This constructor, creates a Reptile object with the given attributes/values.
     * Creates the first GPS location on the day route.
     *
     * @param name       Name of the Reptile.
     * @param initialGPS Initial GPS location of the Reptile.
     */
    public Reptile(String name, GPS initialGPS) {
        super(name, initialGPS);
    }

    
}
