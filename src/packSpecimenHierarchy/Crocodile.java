package packSpecimenHierarchy;

/**
 * Represents a Crocodile object on the Serengeti Park.
 *
 * @version Project - Part 2
 * @author Iyán Álvarez
 */
public class Crocodile extends Reptile implements ExtinctionDanger {

    // Attributes
    private static final String CROCODILE_FEEDING = "Big animals";
    private static final String CROCODILE_SOUND = "Gggrrroooinngg ggrrunngg";
    private static final double CROCODILE_DANGER_LEVEL = 0.5;

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

    // Getters
    /**
     * Returns the value of the constant defined for feeding of Crocodile specimens.
     * @return the value of the constant defined for feeding of Crocodile specimens.
     */
    public static String getCrocodileFeeding() {
        return CROCODILE_FEEDING;
    }
    /**
     * Returns the value of the constant defined for sound of Crocodile specimens.
     * @return the value of the constant defined for sound of Crocodile specimens.
     */
    public static String getCrocodileSound() {
        return CROCODILE_SOUND;
    }
    /**
     * Returns the value of the constant defined for danger level of Crocodile specimens.
     * @return the value of the constant defined for danger level of Crocodile specimens.
     */
    public static double getCrocodileDangerLevel() {
        return CROCODILE_DANGER_LEVEL;
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
