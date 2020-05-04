package serengetiPark;

public abstract class Feline extends Carnivorous {

    // Attributes
    private final String FELINE_WALK = "Stealthy walk";

    // Constructors
    /**
     * This constructor, creates a Feline object with the given attributes/values.
     * Creates the first GPS location on the day route.
     *
     * @param name       Name of the Feline.
     * @param initialGPS Initial GPS location of the Feline.
     */
    public Feline(String name, GPS initialGPS) {
        super(name, initialGPS);
    }

    // Methods
    /**
     * Returns the walk of Feline specimens.
     * @return walk of Feline specimens.
     */
    @Override public String walk() {
        return FELINE_WALK;
    }


}
