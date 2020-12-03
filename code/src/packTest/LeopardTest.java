package packTest;

import org.junit.jupiter.api.*;
import packSpecimenHierarchy.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test of Leopard class methods")
class LeopardTest {

    static Leopard le;

    @BeforeAll
    static void setUpBeforeAll() {
        le = new Leopard("LeopardExample" , new GPS(0,0));
    }

    @Test @DisplayName("Test of Leopard getName()")
    void testGetName() {
        assertEquals("LeopardExample", le.getName());
    }

    @Test @DisplayName("Test of Leopard feeding()")
    void testFeeding() {
        assertEquals(Carnivorous.getCarnivorousFeeding(), le.feeding());
    }

    @Test @DisplayName("Test of Leopard sound()")
    void testSound() {
        assertEquals(Feline.getFelineSound(), le.sound());
    }

    @Test @DisplayName("Test of Leopard walk()")
    void testWalk() {
        assertEquals(Feline.getFelineWalk(), le.walk());
    }

    @Test @DisplayName("Test of Leopard inheritancePath()")
    void testInheritancePath() {
        assertEquals("Leopard < Feline < Carnivorous < Mammal < Specimen", le.inheritancePath());
    }


}