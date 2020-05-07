package packSpecimenHierarchy;

/**
 * Represents a Hipopotamus object on the Serengeti Park.
 *
 * @version Project - Part 2
 * @author Iyán Álvarez
 */
public class Hippopotamus extends Herbivorous {

    // Constructors
    /**
     * This constructor, creates a Hipopotamus object with the given attributes/values.
     * Creates the first GPS location on the day route.
     *
     * @param name       Name of the Hipopotamus.
     * @param initialGPS Initial GPS location of the Hipopotamus.
     */
    public Hippopotamus(String name, GPS initialGPS) {
        super(name, initialGPS);
    }

    /**
     * Returns the inheritance path of a Hippopotamus.
     * @return inheritance path of a Hippopotamus.
     */
    @Override public String inheritancePath() {
        return "Hippopotamus < " + super.inheritancePath();
    }

}
