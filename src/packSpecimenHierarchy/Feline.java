package packSpecimenHierarchy;

public abstract class Feline extends Carnivorous {

    // Attributes
    public static final String FELINE_SOUND = "Roaaarr roaarrr";
    public static final String FELINE_WALK = "Stealthy walk";

    // Constructors
    /**
     * This constructor, creates a Feline object with the given attributes/values.
     * Creates the first GPS location on the day route.
     *
     * @param name       Name of the Feline.
     * @param initialGPS Initial GPS location of the Feline.
     */
    public Feline(String name, GPS initialGPS) {
        super(name, initialGPS);
    }

    // Methods
    /**
     * Returns the sound of Feline specimens.
     * @return sound of Feline specimens.
     */
    @Override public String sound() {
        return FELINE_SOUND;
    }
    /**
     * Returns the walk of Feline specimens.
     * @return walk of Feline specimens.
     */
    @Override public String walk() {
        return FELINE_WALK;
    }
    /**
     * Returns the inheritance path of a Feline.
     * @return inheritance path of a Feline.
     */
    @Override public String inheritancePath() {
        return "Feline" + " < " + super.inheritancePath();
    }
}
