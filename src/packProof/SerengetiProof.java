package packProof;

import packSpecimenHierarchy.*;

import java.util.ArrayList;

public class SerengetiProof {

    // Methods
    /**
     * Obtains and prints the Specimens that are in the given list ordered by quantity of each one and
     * characteristics.
     *
     * @param specimenList  List of Specimens to print the information of quantity and characteristics
     *                      in order.
     */
    public static void whoIsInSerengeti(ArrayList<Specimen> specimenList) {
        System.out.println("Specimens that are in the Serengeti Natural Park: ");
        for (Specimen s: specimenList) {
            System.out.println(s.getClass().getSimpleName());
            // TODO Falta implementar número de Specimens de cada tipo concreto.
            System.out.println(" - Feeding: " + s.feeding());
            System.out.println(" - Sound: "   + s.feeding());
            if (s instanceof Mammal) {
                System.out.println(" - Walk: " + ((Mammal) s).walk());
            }
            if (s instanceof ExtinctionDanger) {
                System.out.println(" - Danger level: " + ((ExtinctionDanger) s).whatDangerLevel());
            }
        }
    }
    /**
     * Obtains and prints the Specimens name and concrete class that are on the given list and have the same
     * or higher danger level.
     *
     * @param specimenList  List of Specimens to obtain the ones that are endangered on the given danger level.
     * @param dangerLevel   Danger level that is going to be set as frontier, the ones that have the same one
     *                      or higher will be printed.
     */
    public static void howManyEndangeredSpecimen(ArrayList<Specimen> specimenList, double dangerLevel) {
        System.out.println("Specimens in danger of extinction equal to or greater than level " + dangerLevel + ": ");
        for (Specimen s: specimenList) {
            if (s instanceof ExtinctionDanger && dangerLevel <= ((ExtinctionDanger) s).whatDangerLevel()) {
                System.out.println(s.getName() + " (" + s.getClass().getSimpleName() + ")");
            }
        }
    }
    /**
     * Returns if the given mammal is endangered or not.
     *
     * @param mammal    Mammal that will be checked.
     * @return          true if and only if the given Mammal is in extinction danger, otherwise false.
     */
    public boolean checkExtinctionDanger(Mammal mammal) {
        if (mammal instanceof ExtinctionDanger) {
            return true;
        }
        else {
            return false;
        }
    }
}
