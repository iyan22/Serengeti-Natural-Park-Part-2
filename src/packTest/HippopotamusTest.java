package packTest;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import packSpecimenHierarchy.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test of Hippopotamus class methods")
class HippopotamusTest {

    static Hippopotamus hi;

    @BeforeAll
    static void setUpBeforeAll() {
        hi = new Hippopotamus("HippopotamusExample" , new GPS(0,0));
    }

    @Test @DisplayName("Test of Hippopotamus getName()")
    void testGetName() {
        assertEquals("HippopotamusExample", hi.getName());
    }

    @Test @DisplayName("Test of Hippopotamus feeding()")
    void testFeeding() {
        assertEquals(Hippopotamus.getHerbivorousFeeding(), hi.feeding());
    }

    @Test @DisplayName("Test of Hippopotamus sound()")
    void testSound() {
        assertEquals(Hippopotamus.getHerbivorousSound(), hi.sound());
    }

    @Test @DisplayName("Test of Hippopotamus walk()")
    void testWalk() {
        assertEquals(Hippopotamus.getHerbivorousWalk(), hi.walk());
    }

    @Test @DisplayName("Test of Hippopotamus inheritancePath()")
    void testInheritancePath() {
        assertEquals("Hippopotamus < Herbivorous < Mammal < Specimen", hi.inheritancePath());
    }


}