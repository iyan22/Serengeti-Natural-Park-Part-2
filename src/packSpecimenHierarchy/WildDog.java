package packSpecimenHierarchy;

/**
 * Represents a WildDog object on the Serengeti Park.
 *
 * @version Project - Part 2
 * @author Iyán Álvarez
 */
public class WildDog extends Carnivorous implements ExtinctionDanger {

    // Attributes
    private static final String WILDDOG_SOUND = "Aiiiiiiii aii aiii";
    private static final String WILDDOG_WALK = "Light walk";
    private static final double WILDDOG_DANGER_LEVEL = 1.7;

    // Constructors
    /**
     * This constructor, creates a WildDog object with the given attributes/values.
     * Creates the first GPS location on the day route.
     *
     * @param name       Name of the WildDog.
     * @param initialGPS Initial GPS location of the WildDog.
     */
    public WildDog(String name, GPS initialGPS) {
        super(name, initialGPS);
    }

    // Getters
    /**
     * Returns the value of the constant defined for sound of WildDog specimens.
     * @return the value of the constant defined for sound of WildDog specimens.
     */
    public static String getWildDogSound() {
        return WILDDOG_SOUND;
    }
    /**
     * Returns the value of the constant defined for walk of WildDog specimens.
     * @return the value of the constant defined for walk of WildDog specimens.
     */
    public static String getWildDogWalk() {
        return WILDDOG_WALK;
    }
    /**
     * Returns the value of the constant defined for danger level of WildDog specimens.
     * @return the value of the constant defined for danger level of WildDog specimens.
     */
    public static double getWildDogDangerLevel() {
        return WILDDOG_DANGER_LEVEL;
    }

    // Methods
    /**
     * Returns the sound of WildDog specimens.
     * @return sound of WildDog specimens.
     */
    @Override public String sound() {
        return WILDDOG_SOUND;
    }
    /**
     * Returns the walk of WildDog specimens.
     * @return walk of WildDog specimens.
     */
    @Override public String walk() {
        return WILDDOG_WALK;
    }
    /**
     * Returns the danger level of WildDog specimens.
     * @return the danger level of WildDog specimens.
     */
    @Override public double whatDangerLevel() {
        return WILDDOG_DANGER_LEVEL;
    }
    /**
     * Returns the inheritance path of a WildDog.
     * @return inheritance path of a WildDog.
     */
    @Override public String inheritancePath() {
        return "WildDog < " + super.inheritancePath();
    }

}
