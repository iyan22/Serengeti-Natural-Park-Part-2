package packSpecimenHierarchy;

/**
 * Represents a Zebra object on the Serengeti Park.
 *
 * @version Project - Part 2
 * @author Iyán Álvarez
 */
public class Zebra extends Herbivorous {

    // Attributes
    public static final String ZEBRA_SOUND = "Hiiiihiiiii hiiiihiii";
    // TODO Walk Mammal

    // Constructors
    public Zebra(String name, GPS initialGPS) {
        super(name, initialGPS);
    }

    // Methods
    /**
     * Returns the sound of Zebra specimens.
     * @return sound of Zebra specimens.
     */
    @Override public String sound() {
        return ZEBRA_SOUND;
    }
    /**
     * Returns the inheritance path of a Zebra.
     * @return inheritance path of a Zebra.
     */
    @Override public String inheritancePath() {
        return "Zebra" + " < " + super.inheritancePath();
    }

}
