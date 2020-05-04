package serengetiPark;

/**
 * Represents a BlackRhino object on the Serengeti Park.
 *
 * @version Project - Part 2
 * @author Iyán Álvarez
 */
public class BlackRhino extends Herbivorous implements ExtintionDanger {

    // Attributes
    private final String BLACKRHINO_SOUND = "Whinny whinny";
    // TODO Walk Mammal

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

    // Methods
    /**
     * Returns the sound of BlackRhino specimens.
     * @return sound of BlackRhino specimens.
     */
    @Override public String sound() {
        return BLACKRHINO_SOUND;
    }
    /**
     * Returns the danger level of BlackRhino specimens.
     * @return walk of BlackRhino specimens.
     */
    @Override public double whatDangerLevel() {
        return BLACKRHINO_DANGER_LEVEL;
    }

}
