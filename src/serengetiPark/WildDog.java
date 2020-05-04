package serengetiPark;

public class WildDog extends Carnivorous implements ExtintionDanger {

    // Constructors
    /**
     * This constructor, creates a WildDog object with the given attributes/values.
     * Creates the first GPS location on the day route.
     *
     * @param name       Name of the WildDog.
     * @param initialGPS Initial GPS location of the WildDog.
     */
    public WildDog(String name, GPS initialGPS) {
        super(name, initialGPS);
    }

    // Methods
    @Override public double whatDangerLevel() {
        return WILDDOG_DANGER_LEVEL;
    }

}
