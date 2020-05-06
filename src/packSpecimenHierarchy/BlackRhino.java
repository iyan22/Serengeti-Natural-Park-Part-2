package packSpecimenHierarchy;

/**
 * Represents a BlackRhino object on the Serengeti Park.
 *
 * @version Project - Part 2
 * @author Iyán Álvarez
 */
public class BlackRhino extends Herbivorous implements ExtinctionDanger {

    // Attributes
    private static final String BLACKRHINO_SOUND = "Whinny whinny";
    private static final String BLACKRHINO_WALK = "Slow walk";
    private static final double BLACKRHINO_DANGER_LEVEL = 2.2;

    // Constructors
    /**
     * This constructor, creates a BlackRhino object with the given attributes/values.
     * Creates the first GPS location on the day route.
     *
     * @param name       Name of the BlackRhino.
     * @param initialGPS Initial GPS location of the BlackRhino.
     */
    public BlackRhino(String name, GPS initialGPS) {
        super(name, initialGPS);
    }

    // TODO Preguntar implementacion walk de BlackRhino y Hippopotamus en Mammal.

    // Getters
    /**
     * Returns the value of the constant defined for sound of BlackRhino specimens.
     * @return the value of the constant defined for sound of BlackRhino specimens.
     */
    public static String getBlackRhinoSound() {
        return BLACKRHINO_SOUND;
    }
    /**
     * Returns the value of the constant defined for walk of BlackRhino specimens.
     * @return the value of the constant defined for walk of BlackRhino specimens.
     */
    public static String getBlackRhinoWalk() {
        return BLACKRHINO_WALK;
    }
    /**
     * Returns the value of the constant defined for danger level of BlackRhino specimens.
     * @return the value of the constant defined for danger level of BlackRhino specimens.
     */
    public static double getBlackRhinoDangerLevel() {
        return BLACKRHINO_DANGER_LEVEL;
    }

    // Methods
    /**
     * Returns the sound of BlackRhino specimens.
     * @return sound of BlackRhino specimens.
     */
    @Override public String sound() {
        return BLACKRHINO_SOUND;
    }
    /**
     * Returns the walk of BlackRhino specimens.
     * @return walk of BlackRhino specimens.
     */
    @Override public String walk() {
        return BLACKRHINO_WALK;
    }
    /**
     * Returns the danger level of BlackRhino specimens.
     * @return the danger level of BlackRhino specimens.
     */
    @Override public double whatDangerLevel() {
        return BLACKRHINO_DANGER_LEVEL;
    }
    /**
     * Returns the inheritance path of a BlackRhino.
     * @return inheritance path of a BlackRhino.
     */
    @Override public String inheritancePath() {
        return "BlackRhino < " + super.inheritancePath();
    }

}
