package packSpecimenHierarchy;

/**
 * Represents a Herbivorous object on the Serengeti Park.
 *
 * @version Project - Part 2
 * @author Iyán Álvarez
 */
public abstract class Herbivorous extends Mammal {

    // Attributes
    public static final String HERBIVOROUS_FEEDING = "Plants, grasses and herbs";

    // Constructors
    /**
     * This constructor, creates a Herbivorous object with the given attributes/values.
     * Creates the first GPS location on the day route.
     *
     * @param name       Name of the Herbivorous.
     * @param initialGPS Initial GPS location of the Herbivorous.
     */
    public Herbivorous(String name, GPS initialGPS) {
        super(name, initialGPS);
    }

    // Methods
    /**
     * Returns the feeding of Herbivorous specimens.
     * @return feeding of Herbivorous specimens.
     */
    public String feeding() {
        return HERBIVOROUS_FEEDING;
    }
    /**
     * Returns the inheritance path of a Herbivorous.
     * @return inheritance path of a Herbivorous.
     */
    @Override public String inheritancePath() {
        return "Herbivorous" + " < " + super.inheritancePath();
    }


}
