package packTest;

import org.junit.jupiter.api.*;
import packSpecimenHierarchy.GPS;
import packSpecimenHierarchy.Herbivorous;
import packSpecimenHierarchy.Mammal;
import packSpecimenHierarchy.Zebra;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test of Zebra class methods")
class ZebraTest {

    static Zebra z;

    @BeforeAll
    static void setUpBeforeAll() {
        z = new Zebra("ZebraExample" , new GPS(0,0));
    }

    @Test @DisplayName("Test of Zebra getName()")
    void testGetName() {
        assertEquals("ZebraExample", z.getName());
    }

    @Test @DisplayName("Test of Zebra feeding()")
    void testFeeding() {
        Assertions.assertEquals(Herbivorous.HERBIVOROUS_FEEDING, z.feeding());
    }

    @Test @DisplayName("Test of Zebra sound()")
    void testSound() {
        assertEquals(Zebra.ZEBRA_SOUND, z.sound());
    }

    @Test @DisplayName("Test of Zebra walk()")
    void testWalk() {
        Assertions.assertEquals(Mammal.MAMMAL_WALK, z.walk());
    }

    @Test @DisplayName("Test of Zebra inheritancePath()")
    void testInheritancePath() {
        assertEquals("Zebra < Herbivorous < Mammal < Specimen", z.inheritancePath());
    }

}