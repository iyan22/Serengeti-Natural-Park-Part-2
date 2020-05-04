package serengetiPark;

/**
 * Represents a Lion object on the Serengeti Park.
 *
 * @version Project - Part 2
 * @author Iyán Álvarez
 */
public class Lion extends Feline {

    // Attributes
    private final String LION_SOUND = "Roaaarr roaarrr";

    // Constructors
    /**
     * This constructor, creates a Lion object with the given attributes/values.
     * Creates the first GPS location on the day route.
     *
     * @param name       Name of the Lion.
     * @param initialGPS Initial GPS location of the Lion.
     */
    public Lion(String name, GPS initialGPS) {
        super(name, initialGPS);
    }

    // Methods
    /**
     * Returns the sound of Lion specimens.
     * @return sound of Lion specimens.
     */
    @Override public String sound() {
        return LION_SOUND;
    }

}
