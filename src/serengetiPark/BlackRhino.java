package serengetiPark;

public class BlackRhino extends Herbivorous implements ExtintionDanger {

    // Constructors
    /**
     * This constructor, creates a BlackRhino object with the given attributes/values.
     * Creates the first GPS location on the day route.
     *
     * @param name       Name of the BlackRhino.
     * @param initialGPS Initial GPS location of the BlackRhino.
     */
    public BlackRhino(String name, GPS initialGPS) {
        super(name, initialGPS);
    }

    // Methods
    @Override public double whatDangerLevel() {
        return BLACKRHINO_DANGER_LEVEL;
    }

}
