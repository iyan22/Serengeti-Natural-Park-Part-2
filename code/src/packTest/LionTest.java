package packTest;

import org.junit.jupiter.api.*;
import packSpecimenHierarchy.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test of Lion class methods")
class LionTest {

    static Lion li;

    @BeforeAll
    static void setUpBeforeAll() {
        li = new Lion("LionExample" , new GPS(0,0));
    }

    @Test @DisplayName("Test of Lion getName()")
    void testGetName() {
        assertEquals("LionExample", li.getName());
    }

    @Test @DisplayName("Test of Lion feeding()")
    void testFeeding() {
        assertEquals(Carnivorous.getCarnivorousFeeding(), li.feeding());
    }

    @Test @DisplayName("Test of Lion sound()")
    void testSound() {
        assertEquals(Feline.getFelineSound(), li.sound());
    }

    @Test @DisplayName("Test of Lion walk()")
    void testWalk() {
        assertEquals(Feline.getFelineWalk(), li.walk());
    }

    @Test @DisplayName("Test of Lion inheritancePath()")
    void testInheritancePath() {
        assertEquals("Lion < Feline < Carnivorous < Mammal < Specimen", li.inheritancePath());
    }

}