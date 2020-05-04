package serengetiPark;

/**
 * Represents a Hipopotamus object on the Serengeti Park.
 *
 * @version Project - Part 2
 * @author Iyán Álvarez
 */
public class Hipopotamus extends Herbivorous {

    // Attributes
    private final String HIPOPOTAMUS_SOUND = "Ouuuuughtttt ouught";
    private final String HIPOPOTAMUS_WALK = "Slow walk";
    // TODO Walk Mammal

    // Constructors
    /**
     * This constructor, creates a Hipopotamus object with the given attributes/values.
     * Creates the first GPS location on the day route.
     *
     * @param name       Name of the Hipopotamus.
     * @param initialGPS Initial GPS location of the Hipopotamus.
     */
    public Hipopotamus(String name, GPS initialGPS) {
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

}
