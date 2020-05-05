package packSpecimenHierarchy;

/**
 * Represents a Turtle object on the Serengeti Park.
 *
 * @version Project - Part 2
 * @author Iyán Álvarez
 */
public class Turtle extends Reptile {

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
     * Returns the inheritance path of a Turtle.
     * @return inheritance path of a Turtle.
     */
    @Override public String inheritancePath() {
        return "Turtle" + " < " + super.inheritancePath();
    }

}
