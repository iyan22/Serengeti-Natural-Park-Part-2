package packSpecimenHierarchy;

public abstract class Carnivorous extends Mammal {

    // Attributes
    public static final String CARNIVOROUS_FEEDING = "Other animals";

    // Constructors
    /**
     * This constructor, creates a Carnivorous object with the given attributes/values.
     * Creates the first GPS location on the day route.
     *
     * @param name       Name of the Carnivorous.
     * @param initialGPS Initial GPS location of the Carnivorous.
     */
    public Carnivorous(String name, GPS initialGPS) {
        super(name, initialGPS);
    }

    // Methods
    /**
     * Returns the feeding of Carnivorous specimens.
     * @return feeding of Carnivorous specimens.
     */
    public String feeding() {
        return CARNIVOROUS_FEEDING;
    }
    /**
     * Returns the inheritance path of a Carnivorous.
     * @return inheritance path of a Carnivorous.
     */
    @Override public String inheritancePath() {
        return "Carnivorous" + " < " + super.inheritancePath();
    }
}
