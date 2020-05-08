package packSpecimenHierarchy;

/**
 * Represents a Reptile object on the Serengeti Park.
 *
 * @version Project - Part 2
 * @author Iyán Álvarez
 */
public abstract class Reptile extends Specimen {

    // Attributes
    private static final String REPTILE_FEEDING = "Little animals and insects";
    private static final String REPTILE_SOUND = "Sssssiiigghh sssiiiighh";

    // Constructors
    /**
     * This constructor, creates a Reptile object with the given attributes/values.
     * Creates the first GPS location on the day route.
     *
     * @param name       Name of the Reptile.
     * @param initialGPS Initial GPS location of the Reptile.
     */
    public Reptile(String name, GPS initialGPS) {
        super(name, initialGPS);
    }

    // Getters
    /**
     * Returns the value of the constant defined for feeding of Reptile specimens.
     * @return the value of the constant defined for feeding of Reptile specimens.
     */
    public static String getReptileFeeding() {
        return REPTILE_FEEDING;
    }
    /**
     * Returns the value of the constant defined for sound of Reptile specimens.
     * @return the value of the constant defined for sound of Reptile specimens.
     */
    public static String getReptileSound() {
        return REPTILE_SOUND;
    }

    // Methods
    /**
     * Returns the feeding of Reptile specimens.
     * @return feeding of Reptile specimens.
     */
    @Override public String feeding() {
        return REPTILE_FEEDING;
    }
    /**
     * Returns the sound of Reptile specimens.
     * @return sound of Reptile specimens.
     */
    @Override public String sound() {
        return REPTILE_SOUND;
    }
    /**
     * Returns the inheritance path of a Reptile.
     * @return inheritance path of a Reptile.
     */
    @Override public String inheritancePath() {
        return "Reptile" + " < " + super.inheritancePath();
    }
    /**
     * Returns the basic information of the Reptile.
     * @return the basic information of the Reptile.
     */
    @Override public String toString() {
        return "Reptile: " + this.getName();
    }

}
