package packTest;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import packSpecimenHierarchy.*;

import static org.junit.jupiter.api.Assertions.*;

class HipopotamusTest {

    static Hippopotamus hi;

    @BeforeAll
    static void setUpBeforeAll() {
        hi = new Hippopotamus("HippopotamusExample" , new GPS(0,0));
    }

    @Test
    @DisplayName("Test of Hippopotamus getName()")
    void testGetName() {
        assertEquals("HippopotamusExample", hi.getName());
    }

    @Test @DisplayName("Test of Hippopotamus feeding()")
    void testFeeding() {
        assertEquals(Herbivorous.HERBIVOROUS_FEEDING, hi.feeding());
    }

    @Test @DisplayName("Test of Hippopotamus sound()")
    void testSound() {
        assertEquals(Hippopotamus.HIPOPOTAMUS_SOUND, hi.sound());
    }

    @Test @DisplayName("Test of Hippopotamus walk()")
    void testWalk() {
        assertEquals(Hippopotamus.HIPOPOTAMUS_WALK, hi.walk());
    }

    @Test @DisplayName("Test of Hippopotamus inheritancePath()")
    void testInheritancePath() {
        assertEquals("Hippopotamus < Herbivorous < Mammal < Specimen", hi.inheritancePath());
    }


}