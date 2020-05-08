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
        ArrayList<String> name      = new ArrayList<>();
        ArrayList<Integer> amount   = new ArrayList<>();
        ArrayList<Specimen> example = new ArrayList<>();
        for (Specimen s: specimenList) {                        // Polymorphism
            String className = s.getClass().getSimpleName();
            if(name.contains(className)) {
                int index = name.indexOf(className);
                int newamount = amount.get(index)+1;
                amount.add(index, newamount);
            }
            else {
                name.add(className);
                amount.add(1);
                example.add(s);
            }
        }
        System.out.println("Specimens that are in the Serengeti Natural Park: ");
        for (String n: name) {
            int index = name.indexOf(n);
            Specimen ex = example.get(index);
            System.out.println(n);
            System.out.println(" - Amount: " + amount.get(index));
            System.out.println(" - Feeding: " + ex.feeding());          // Dispatching
            System.out.println(" - Sound: " + ex.sound());              // Dispatching
            if (ex instanceof Mammal) {
                System.out.println(" - Walk: " + ((Mammal) ex).walk()); // Dispatching
            }
            if (ex instanceof ExtinctionDanger) {
                System.out.println(" - Danger level: " + ((ExtinctionDanger) ex).whatDangerLevel()); // Dispatching
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
            if (s instanceof ExtinctionDanger && dangerLevel <= ((ExtinctionDanger) s).whatDangerLevel()) { // Polymorphism
                System.out.println(" - " +s.toString());    // Dispatching
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

    // Main
    /**
     * Simulation of the methods defined at SerengetiProof class.
     * @param args  Not used.
     */
    public static void main(String[] args) {

        ArrayList<Specimen> sp = new ArrayList<>();

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

        whoIsInSerengeti(sp);
        System.out.println();

        double dangerLevel = 1.0;
        int endangered = howManyEndangeredSpecimen(sp, dangerLevel);
        System.out.println("There are " + endangered + " specimens with equal or or higher level of extinction than " + dangerLevel + ".");
        System.out.println();

        Zebra z = ze1;
        Mammal m = wd1;
        Specimen s = wd2;
        Object o = br2;
        Reptile r = sn2;

        // Correct
        // We can do this operation without any problem, the class Zebra is a subclass of Mammal, the input type/class.
        System.out.println("The variable z has Zebra as static type and " + z.getClass().getSimpleName()+" as dynamic type. " +
                           "Is it in danger?? "+ checkExtinctionDanger(z) + "\n");

        // Correct
        // We can do this operation without any problem, the class WildDog is a subclass of Mammal the input type/class.
        // All the subclasses that could be assigned to Mammal with or without casting, will work without problems.
        System.out.println("The variable m has Mammal as static type and " + m.getClass().getSimpleName()+" as dynamic type. " +
                           "Is it in danger?? "+ checkExtinctionDanger(m) + "\n");

        // Runtime error
        // If the variable assigned to Specimen s is Mammal or one of them subclasses will work without any problem (doing casting),
        // otherwise we can not do a casting to Mammal and a exception will be thrown causing a runtime error.
        try {
            System.out.println("The variable s has Specimen as static type and " + s.getClass().getSimpleName() + " as dynamic type. " +
                               "Is it in danger?? " + checkExtinctionDanger((Mammal) s));
        } catch (ClassCastException e) {
            System.out.println("The variable s has Specimen as static type and " + s.getClass().getSimpleName() + " as dynamic type.");
            System.out.println("Runtime error: You can't cast that dynamic type into Mammal. \n");
        }

        // Correct, explicit conversion (casting)
        // If the variable assigned to Object o is Mammal or one of them subclasses will work without any problem (doing casting),
        // otherwise we can not do a casting to Mammal and a exception will be thrown causing a runtime error.
        System.out.println("The variable o has Object as static type and " + o.getClass().getSimpleName()+" as dynamic type. " +
                           "Is it in danger?? "+ checkExtinctionDanger((Mammal) o) + "\n");

        // Compilation error
        // If the class is not on the branch of Mammal, in this case Reptile will not compile.
        System.out.println("The variable r has Reptile as static type and " + r.getClass().getSimpleName()+" as dynamic type. " );
                           // "Is it in danger?? " checkExtinctionDanger(r));
        System.out.println("Compilation error: You can't cast that dynamic type into Mammal. \n");

    }

}


