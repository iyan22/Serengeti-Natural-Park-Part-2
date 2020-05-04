package serengetiPark;

/**
 * Represents a Leopard object on the Serengeti Park.
 *
 * @version Project - Part 2
 * @author Iyán Álvarez
 */
public class Leopard extends Feline {

    // Attributes
    private final String LEOPARD_SOUND = "Roaaarr roaarrr";

    // Constructors
    /**
     * This constructor, creates a Leopard object with the given attributes/values.
     * Creates the first GPS location on the day route.
     *
     * @param name       Name of the Leopard.
     * @param initialGPS Initial GPS location of the Leopard.
     */
    public Leopard(String name, GPS initialGPS) {
        super(name, initialGPS);
    }

    // Methods
    /**
     * Returns the sound of Leopard specimens.
     * @return sound of Leopard specimens.
     */
    @Override public String sound() {
        return LEOPARD_SOUND;
    }
}
