package serengetiPark;

public class Crocodile extends Reptile implements ExtintionDanger {

    // Attributes
    private final String CROCODILE_FEEDING = "Big animals";
    private final String CROCODILE_SOUND = "Gggrrroooinngg ggrrunngg";

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
    public String feeding() {
        return CROCODILE_FEEDING;
    }

    @Override public double whatDangerLevel() {
        return CROCODILE_DANGER_LEVEL;
    }
}
