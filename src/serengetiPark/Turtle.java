package serengetiPark;

/**
 * Represents a Turtle object on the Serengeti Park.
 *
 * @version Project - Part 2
 * @author Iyán Álvarez
 */
public class Turtle extends Reptile {

    // Attributes
    private final String TURTLE_SOUND = "Aiggghhh Aiggghh";
    private final String TURTLE_WALK = "Slow walk";

    // Constructors
    /**
     * This constructor, creates a Turtle object with the given attributes/values.
     * Creates the first GPS location on the day route.
     *
     * @param name       Name of the Turtle.
     * @param initialGPS Initial GPS location of the Turtle.
     */
    public Turtle(String name, GPS initialGPS) {
        super(name, initialGPS);
    }

    // Methods
    /**
     * Returns the sound of Turtle specimens.
     * @return sound of Turtle specimens.
     */
    @Override public String sound() {
        return TURTLE_SOUND;
    }
    /**
     * Returns the walk of Turtle specimens.
     * @return walk of Turtle specimens.
     */
    @Override public String walk() {
        return TURTLE_WALK;
    }

}
