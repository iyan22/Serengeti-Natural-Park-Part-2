package packTest;

import org.junit.jupiter.api.*;
import packSpecimenHierarchy.GPS;
import packSpecimenHierarchy.Herbivorous;
import packSpecimenHierarchy.Mammal;
import packSpecimenHierarchy.Zebra;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test of Zebra class methods")
class ZebraTest {

    static Zebra ze;

    @BeforeAll
    static void setUpBeforeAll() {
        ze = new Zebra("ZebraExample" , new GPS(0,0));
    }

    @Test @DisplayName("Test of Zebra getName()")
    void testGetName() {
        assertEquals("ZebraExample", ze.getName());
    }

    @Test @DisplayName("Test of Zebra feeding()")
    void testFeeding() {
        assertEquals(Herbivorous.getHerbivorousFeeding(), ze.feeding());
    }

    @Test @DisplayName("Test of Zebra sound()")
    void testSound() {
        assertEquals(Zebra.getZebraSound(), ze.sound());
    }

    @Test @DisplayName("Test of Zebra walk()")
    void testWalk() {
        assertEquals(Zebra.getZebraWalk(), ze.walk());
    }

    @Test @DisplayName("Test of Zebra inheritancePath()")
    void testInheritancePath() {
        assertEquals("Zebra < Herbivorous < Mammal < Specimen", ze.inheritancePath());
    }

}