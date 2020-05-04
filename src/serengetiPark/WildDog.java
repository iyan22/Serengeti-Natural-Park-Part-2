package serengetiPark;

/**
 * Represents a WildDog object on the Serengeti Park.
 *
 * @version Project - Part 2
 * @author Iyán Álvarez
 */
public class WildDog extends Carnivorous implements ExtintionDanger {

    // Attributes
    private final String WILDDOG_SOUND = "Grrrrr wooof wooof";
    private final String WILDDOG_WALK = "Light walk";
    // TODO Walk Mammal

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
     * @return walk of WildDog specimens.
     */
    @Override public double whatDangerLevel() {
        return WILDDOG_DANGER_LEVEL;
    }

}
