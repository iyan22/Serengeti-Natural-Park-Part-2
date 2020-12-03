package packSpecimenHierarchy;

/**
 * Represents a BlackRhino object on the Serengeti Park.
 *
 * @version Project - Part 2
 * @author Iyán Álvarez
 */
public class BlackRhino extends Herbivorous implements ExtinctionDanger {

    // Attributes
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

    // Getters
    /**
     * Returns the value of the constant defined for danger level of BlackRhino specimens.
     * @return the value of the constant defined for danger level of BlackRhino specimens.
     */
    public static double getBlackRhinoDangerLevel() {
        return BLACKRHINO_DANGER_LEVEL;
    }

    // Methods
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
    /**
     * Returns the basic information of the BlackRhino.
     * @return the basic information of the BlackRhino.
     */
    @Override public String toString() {
        return "BlackRhino: " + this.getName();
    }
}
