package packSpecimenHierarchy;

/**
 * Represents a Herbivorous object on the Serengeti Park.
 *
 * @version Project - Part 2
 * @author Iyán Álvarez
 */
public abstract class Herbivorous extends Mammal {

    // Attributes
    private static final String HERBIVOROUS_FEEDING = "Plants, grasses and herbs";
    private static final String HERBIVOROUS_SOUND = "Whinny whinny";    // BlackRhino and Hippopotamus
    private static final String HERBIVOROUS_WALK = "Slow walk";         // BlackRhino and Hippopotamus

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

    // Getters
    /**
     * Returns the value of the constant defined for feeding of Herbivorous specimens.
     * @return the value of the constant defined for feeding of Herbivorous specimens.
     */
    public static String getHerbivorousFeeding() {
        return HERBIVOROUS_FEEDING;
    }
    /**
     * Returns the value of the constant defined for sound of Herbivorous specimens.
     * @return the value of the constant defined for sound of Herbivorous specimens.
     */
    public static String getHerbivorousSound() {
        return HERBIVOROUS_SOUND;
    }
    /**
     * Returns the value of the constant defined for walk of Herbivorous specimens.
     * @return the value of the constant defined for walk of Herbivorous specimens.
     */
    public static String getHerbivorousWalk() {
        return HERBIVOROUS_WALK;
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
     * Returns the sound of Herbivorous specimens.
     * @return sound of Herbivorous specimens.
     */
    @Override public String sound() {
        return HERBIVOROUS_SOUND;
    }
    /**
     * Returns the walk of Herbivorous specimens.
     * @return walk of Herbivorous specimens.
     */
    @Override public String walk() {
        return HERBIVOROUS_WALK;
    }
    /**
     * Returns the inheritance path of a Herbivorous.
     * @return inheritance path of a Herbivorous.
     */
    @Override public String inheritancePath() {
        return "Herbivorous" + " < " + super.inheritancePath();
    }


}
