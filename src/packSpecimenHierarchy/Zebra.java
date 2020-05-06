package packSpecimenHierarchy;

/**
 * Represents a Zebra object on the Serengeti Park.
 *
 * @version Project - Part 2
 * @author Iyán Álvarez
 */
public class Zebra extends Herbivorous {

    // Attributes
    private static final String ZEBRA_SOUND = "Hiiiihiiiii hiiiihiii";
    private static final String ZEBRA_WALK = "Light walk";

    // Constructors
    public Zebra(String name, GPS initialGPS) {
        super(name, initialGPS);
    }

    // TODO Preguntar implementacion walk de Zebra y WildDog en Mammal.

    // Getters
    /**
     * Returns the value of the constant defined for sound of Zebra specimens.
     * @return the value of the constant defined for sound of Zebra specimens.
     */
    public static String getZebraSound() {
        return ZEBRA_SOUND;
    }
    /**
     * Returns the value of the constant defined for walk of Zebra specimens.
     * @return the value of the constant defined for walk of Zebra specimens.
     */
    public static String getZebraWalk() {
        return ZEBRA_WALK;
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
     * Returns the walk of Zebra specimens.
     * @return walk of Zebra specimens.
     */
    @Override public String walk() {
        return ZEBRA_WALK;
    }
    /**
     * Returns the inheritance path of a Zebra.
     * @return inheritance path of a Zebra.
     */
    @Override public String inheritancePath() {
        return "Zebra < " + super.inheritancePath();
    }

}
