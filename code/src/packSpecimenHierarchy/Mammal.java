package packSpecimenHierarchy;

/**
 * Represents a Mammal object on the Serengeti Park.
 *
 * @version Project - Part 2
 * @author Iyán Álvarez
 */
public abstract class Mammal extends Specimen {

    // Constructors
    /**
     * This constructor, creates a Mammal object with the given attributes/values.
     * Creates the first GPS location on the day route.
     *
     * @param name       Name of the Specimen.
     * @param initialGPS Initial GPS location of the Specimen.
     */
    public Mammal(String name, GPS initialGPS) {
        super(name, initialGPS);
    }

    // Methods
    /**
     * Returns the walk of a specific mammal.
     * @return walk of a specific mammal.
     */
    public abstract String walk();
    /**
     * Returns the inheritance path of a Mammal.
     * @return inheritance path of a Mammal.
     */
    @Override public String inheritancePath() {
        return "Mammal" + " < " + super.inheritancePath();
    }
    /**
     * Returns the basic information of the Mammal.
     * @return the basic information of the Mammal.
     */
    @Override public String toString() {
        return "Mammal: " + this.getName();
    }

}
