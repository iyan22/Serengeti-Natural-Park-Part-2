package serengetiPark;

import java.util.ArrayList;

/**
 * Represents a Specimen object on the Serengeti Park.
 *
 * @version Project - Part 2
 * @author Iyán Álvarez
 */
public abstract class Specimen {

    // Attributes
    private String name;
    private GPS initialGPS;
    private ArrayList<GPS> dayRoute;

    // Constructors
    /**
     * This constructor, creates a Specimen object with the given attributes/values.
     * Creates the first GPS location on the day route.
     * @param name Name of the Specimen.
     * @param initialGPS Initial GPS location of the Specimen.
     */
    public Specimen(String name, GPS initialGPS) {
        this.name = name;
        this.initialGPS = initialGPS;
        this.dayRoute = new ArrayList<GPS>();
        dayRoute.add(initialGPS);
    }

    // Getters
    /**
     * This method, returns the name of the Specimen.
     * @return Name of the Specimen.
     */
    public String getName() {
        return name;
    }
    /**
     * Obtains the first GPS location registered of the Specimen.
     * @return First registered location of the Specimen.
     */
    public GPS initialLocation() {
        return initialGPS;
    }
    /**
     * Obtains the last GPS location registered of the Specimen.
     * @return Last registered location of the Specimen.
     */
    public GPS lastLocation() {
        return dayRoute.get(dayRoute.size()-1);
    }

    // Methods
    /**
     * Obtains the kilometres that the Specimen has travelled in its day route.
     * @return The kilometres travelled by the Specimen this day.
     */
    public double kmsTraveled() {
        double kms = 0.0;
        for(int i = 0; i < dayRoute.size()-1; i++) {
            kms += dayRoute.get(i).distanceTo(dayRoute.get(i+1));
        }
        return kms;
    }
    /**
     * Clears the day route made by the animal, except the initial location.
     */
    public void clearDayRoute() {
        dayRoute.clear();
        dayRoute.add(initialGPS);
    }
    /**
     * Returns true if and only if, the Specimens name and initialLocation are the same.
     * Otherwise, will return false.
     * @param obj Object (Specimen) that will be compared.
     * @return true if and only if, the Specimens name are the same. Otherwise, false.
     */
    @Override public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        else if (!(obj instanceof Specimen)) {
            return false;
        }
        else {
            Specimen otherSpecimen = (Specimen) obj;
            return (this.getName().equals(otherSpecimen.getName()) & this.initialLocation().equals(otherSpecimen.initialLocation()));
        }
    }
    /**
     * Returns the basic information of a Specimen object in a String.
     * @return String with the basic information of a Specimen.
     */
    @Override public String toString() {
        return name + " " + lastLocation().toString();
    }

}
