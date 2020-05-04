package serengetiPark;

public interface ExtintionDanger {

    // Constants
    public static final double BLACKRHINO_DANGER_LEVEL = 2.2;
    public static final double WILDDOG_DANGER_LEVEL = 1.7;
    public static final double CROCODILE_DANGER_LEVEL = 0.5;

    // Methods
    /**
     * Returns the extintion danger level depending on the Specimen.
     * @return Extintion danger level from 3.00 to 0.00.
     */
    public double whatDangerLevel();

}
