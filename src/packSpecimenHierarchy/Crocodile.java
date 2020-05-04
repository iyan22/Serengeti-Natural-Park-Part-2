package packSpecimenHierarchy;

public class Crocodile extends Reptile implements ExtinctionDanger {

    // Attributes
    public static final String CROCODILE_FEEDING = "Big animals";
    public static final String CROCODILE_SOUND = "Gggrrroooinngg ggrrunngg";

    // Constructors
    /**
     * This constructor, creates a Crocodile object with the given attributes/values.
     * Creates the first GPS location on the day route.
     *
     * @param name       Name of the Crocodile.
     * @param initialGPS Initial GPS location of the Crocodile.
     */
    public Crocodile(String name, GPS initialGPS) {
        super(name, initialGPS);
    }

    // Methods

    /**
     * Returns the feeding of Crocodile specimens.
     * @return feeding of Crocodile specimens.
     */
    @Override public String feeding() {
        return CROCODILE_FEEDING;
    }
    /**
     * Returns the sound of Hipopotamus specimens.
     * @return sound of Hipopotamus specimens.
     */
    @Override public String sound() {
        return CROCODILE_SOUND;
    }
    // TODO WALKK??
    @Override public String walk() {
        return null;
    }

    // TODO Reptile walk?

    /**
     * Returns the danger level of Crocodile specimens.
     * @return walk of Crocodile specimens.
     */
    @Override public double whatDangerLevel() {
        return CROCODILE_DANGER_LEVEL;
    }
    /**
     * Returns the inheritance path of a Crocodile.
     * @return inheritance path of a Crocodile.
     */
    @Override public String inheritancePath() {
        return "Crocodile" + " < " + super.inheritancePath();
    }
}
