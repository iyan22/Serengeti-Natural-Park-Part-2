package serengetiPark;

/**
 * Represents a Mammal object on the Serengeti Park.
 *
 * @version Project - Part 2
 * @author Iyán Álvarez
 */
public abstract class Mammal extends Specimen {

    // Attributes
    private final String MAMMAL_WALK = "Slow walk";
    // TODO Walk Mammal

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

    // Methods
    /**
     * Returns the walk of Mammal specimens.
     * @return walk of Mammal specimens.
     */
    @Override public String walk() {
        return MAMMAL_WALK;
    }

}
