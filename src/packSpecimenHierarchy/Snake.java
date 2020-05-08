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

    // Methods
    /**
     * Returns the inheritance path of a Snake.
     * @return inheritance path of a Snake.
     */
    @Override public String inheritancePath() {
        return "Snake" + " < " + super.inheritancePath();
    }
    /**
     * Returns the basic information of the Snake.
     * @return the basic information of the Snake.
     */
    @Override public String toString() {
        return "Snake: " + this.getName();
    }

}
