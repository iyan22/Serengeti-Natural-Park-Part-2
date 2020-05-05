package packSpecimenHierarchy;

/**
 * Represents a Hipopotamus object on the Serengeti Park.
 *
 * @version Project - Part 2
 * @author Iyán Álvarez
 */
public class Hippopotamus extends Herbivorous {

    // Attributes
    public static final String HIPOPOTAMUS_SOUND = "Whinny whinny";
    public static final String HIPOPOTAMUS_WALK = "Slow walk";

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

    // Methods
    /**
     * Returns the sound of Hipopotamus specimens.
     * @return sound of Hipopotamus specimens.
     */
    @Override public String sound() {
        return HIPOPOTAMUS_SOUND;
    }
    /**
     * Returns the walk of Hipopotamus specimens.
     * @return walk of Hipopotamus specimens.
     */
    @Override public String walk() {
        return HIPOPOTAMUS_WALK;
    }
    /**
     * Returns the inheritance path of a Hippopotamus.
     * @return inheritance path of a Hippopotamus.
     */
    @Override public String inheritancePath() {
        return "Hippopotamus" + " < " + super.inheritancePath();
    }
}
