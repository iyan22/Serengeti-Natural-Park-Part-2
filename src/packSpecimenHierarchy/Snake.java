package packSpecimenHierarchy;

/**
 * Represents a Snake object on the Serengeti Park.
 *
 * @version Project - Part 2
 * @author Iyán Álvarez
 */
public class Snake extends Reptile {

    // Constructors
    /**
     * This constructor, creates a Snake object with the given attributes/values.
     * Creates the first GPS location on the day route.
     *
     * @param name       Name of the Snake.
     * @param initialGPS Initial GPS location of the Snake.
     */
    public Snake(String name, GPS initialGPS) {
        super(name, initialGPS);
    }

    @Override
    public String walk() {
        return null;
    }

    // Methods
    // TODO Reptile walk?


}
