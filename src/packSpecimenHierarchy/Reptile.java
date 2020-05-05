package packSpecimenHierarchy;

/**
 * Represents a Reptile object on the Serengeti Park.
 *
 * @version Project - Part 2
 * @author Iyán Álvarez
 */
public abstract class Reptile extends Specimen {

    // Attributes
    public static final String REPTILE_FEEDING = "Little animals and insects";
    public static final String REPTILE_SOUND = "Sssssiiigghh sssiiiighh";

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

    // Methods
    /**
     * Returns the feeding of Reptile specimens.
     * @return feeding of Reptile specimens.
     */
    @Override public String feeding() {
        return REPTILE_FEEDING;
    }
    /**
     * Returns the sound of Reptile specimens.
     * @return sound of Reptile specimens.
     */
    @Override public String sound() {
        return REPTILE_SOUND;
    }
    /**
     * Returns the inheritance path of a Reptile.
     * @return inheritance path of a Reptile.
     */
    @Override public String inheritancePath() {
        return "Reptile" + " < " + super.inheritancePath();
    }
}
