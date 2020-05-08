package packSpecimenHierarchy;

/**
 * Represents a Lion object on the Serengeti Park.
 *
 * @version Project - Part 2
 * @author Iyán Álvarez
 */
public class Lion extends Feline {

    // Constructors
    /**
     * This constructor, creates a Lion object with the given attributes/values.
     * Creates the first GPS location on the day route.
     *
     * @param name       Name of the Lion.
     * @param initialGPS Initial GPS location of the Lion.
     */
    public Lion(String name, GPS initialGPS) {
        super(name, initialGPS);
    }

    // Methods
    /**
     * Returns the inheritance path of a Lion.
     * @return inheritance path of a Lion.
     */
    @Override public String inheritancePath() {
        return "Lion" + " < " + super.inheritancePath();
    }
    /**
     * Returns the basic information of the Lion.
     * @return the basic information of the Lion.
     */
    @Override public String toString() {
        return "Lion: " + this.getName();
    }

}
