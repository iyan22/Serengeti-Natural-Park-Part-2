package packSpecimenHierarchy;

/**
 * Represents a Leopard object on the Serengeti Park.
 *
 * @version Project - Part 2
 * @author Iyán Álvarez
 */
public class Leopard extends Feline {

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
     * Returns the inheritance path of a Feline.
     * @return inheritance path of a Feline.
     */
    @Override public String inheritancePath() {
        return "Leopard" + " < " + super.inheritancePath();
    }
}
