package packSpecimenHierarchy;

/**
 * Represents a Hipopotamus object on the Serengeti Park.
 *
 * @version Project - Part 2
 * @author Iyán Álvarez
 */
public class Hippopotamus extends Herbivorous {

    // Attributes
    private static final String HIPPOPOTAMUS_SOUND = "Whinny whinny";
    private static final String HIPPOPOTAMUS_WALK = "Slow walk";

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

    // TODO Preguntar implementacion walk de BlackRhino y Hippopotamus en Mammal.

    // Getters
    /**
     * Returns the value of the constant defined for sound of Hippopotamus specimens.
     * @return the value of the constant defined for sound of Hippopotamus specimens.
     */
    public static String getHipoppotamusSound() {
        return HIPPOPOTAMUS_SOUND;
    }
    /**
     * Returns the value of the constant defined for walk of Hippopotamus specimens.
     * @return the value of the constant defined for walk of Hippopotamus specimens.
     */
    public static String getHippopotamusWalk() {
        return HIPPOPOTAMUS_WALK;
    }

    // Methods
    /**
     * Returns the sound of Hipopotamus specimens.
     * @return sound of Hipopotamus specimens.
     */
    @Override public String sound() {
        return HIPPOPOTAMUS_SOUND;
    }
    /**
     * Returns the walk of Hipopotamus specimens.
     * @return walk of Hipopotamus specimens.
     */
    @Override public String walk() {
        return HIPPOPOTAMUS_WALK;
    }
    /**
     * Returns the inheritance path of a Hippopotamus.
     * @return inheritance path of a Hippopotamus.
     */
    @Override public String inheritancePath() {
        return "Hippopotamus < " + super.inheritancePath();
    }

}
