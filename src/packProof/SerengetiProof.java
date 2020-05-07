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
     * Obtains the number of endangered Specimens and prints the Specimens name and concrete class that are on
     * the given list and have the same or higher danger level.
     *
     * @param specimenList  List of Specimens to obtain the ones that are endangered on the given danger level.
     * @param dangerLevel   Danger level that is going to be set as frontier, the ones that have the same one
     *                      or higher will be printed.
     * @return              The number of animals that have equal or higher risk in th list to the given one.
     */
    public static int howManyEndangeredSpecimen(ArrayList<Specimen> specimenList, double dangerLevel) {
        int endangered = 0;
        System.out.println("Specimens in danger of extinction equal to or greater than level " + dangerLevel + ": ");
        for (Specimen s: specimenList) {
            if (s instanceof ExtinctionDanger && dangerLevel <= ((ExtinctionDanger) s).whatDangerLevel()) {
                System.out.println(s.getName() + " (" + s.getClass().getSimpleName() + ")");
                endangered++;
            }
        }
        return endangered;
    }
    /**
     * Returns if the given mammal is endangered or not.
     *
     * @param mammal    Mammal that will be checked.
     * @return          true if and only if the given Mammal is in extinction danger, otherwise false.
     */
    public static boolean checkExtinctionDanger(Mammal mammal) {
        return mammal instanceof ExtinctionDanger;
    }


    public static void main(String[] args) {

        ArrayList<Specimen> sp = new ArrayList<Specimen>();

        GPS gps = new GPS(0,0);

        BlackRhino      br1 = new BlackRhino("BlackRhinoExample1", gps);
        BlackRhino      br2 = new BlackRhino("BlackRhinoExample2", gps);
        Crocodile       cr1 = new Crocodile("CrocodileExample1", gps);
        Crocodile       cr2 = new Crocodile("CrocodileExample2", gps);
        Hippopotamus    hi1 = new Hippopotamus("HippopotamusExample1", gps);
        Hippopotamus    hi2 = new Hippopotamus("HippopotamusExample2", gps);
        Leopard         le1 = new Leopard("LeopardExample1", gps);
        Leopard         le2 = new Leopard("LeopardExample2", gps);
        Lion            li1 = new Lion("LionExample1", gps);
        Lion            li2 = new Lion("LionExample2", gps);
        Snake           sn1 = new Snake ("SnakeExample1", gps);
        Snake           sn2 = new Snake ("SnakeExample2", gps);
        Turtle          tu1 = new Turtle("TurtleExample1", gps);
        Turtle          tu2 = new Turtle("TurtleExample2", gps);
        WildDog         wd1 = new WildDog ("WildDogExample1", gps);
        WildDog         wd2 = new WildDog ("WildDogExample2", gps);
        Zebra           ze1 = new Zebra("ZebraExample1", gps);
        Zebra           ze2 = new Zebra("ZebraExample2", gps);

        sp.add(br1);
        sp.add(cr1);
        sp.add(hi1);
        sp.add(le1);
        sp.add(li1);
        sp.add(sn1);
        sp.add(tu1);
        sp.add(wd1);
        sp.add(ze1);
        sp.add(br2);
        sp.add(cr2);
        sp.add(hi2);
        sp.add(le2);
        sp.add(li2);
        sp.add(sn2);
        sp.add(tu2);
        sp.add(wd2);
        sp.add(ze2);

        double dangerLevel = 1.0;
        int endangered = SerengetiProof.howManyEndangeredSpecimen(sp, dangerLevel);
        System.out.println("There are " + endangered + " specimens with equal or or higher level of extinction than " + dangerLevel + ".");
        System.out.println();

        System.out.println("The Mammal (ZebraExample1) is it in danger of extinction? " + SerengetiProof.checkExtinctionDanger(ze1));
        System.out.println("The Mammal (BlackRhinoExample1) is it in danger of extinction? " + SerengetiProof.checkExtinctionDanger(br1));
        System.out.println("The Mammal (WildDogExample2) is it in danger of extinction? " + SerengetiProof.checkExtinctionDanger(wd2));
        System.out.println("The Mammal (HippopotamusExample2) is it in danger of extinction? " + SerengetiProof.checkExtinctionDanger(hi2));
        System.out.println();

        













    }



}


