package packTest;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import packSpecimenHierarchy.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test of Crocodile class methods")
class CrocodileTest {

    static Crocodile cr;

    @BeforeAll
    static void setUpBeforeAll() {
        cr = new Crocodile("CrocodileExample" , new GPS(0,0));
    }

    @Test @DisplayName("Test of Crocodile getName()")
    void testGetName() {
        assertEquals("CrocodileExample", cr.getName());
    }

    @Test @DisplayName("Test of Crocodile feeding()")
    void testFeeding() {
        assertEquals(Crocodile.CROCODILE_FEEDING, cr.feeding());
    }

    @Test @DisplayName("Test of Crocodile sound()")
    void testSound() {
        assertEquals(Crocodile.CROCODILE_SOUND, cr.sound());
    }

    // TODO WALK??
    @Test @DisplayName("Test of Crocodile walk()")
    void testWalk() {
        assertEquals(Mammal.MAMMAL_WALK, cr.walk());
    }

    @Test @DisplayName("Test of Crocodile whatDangerLevel()")
    void whatDangerLevel() {
        assertEquals(ExtinctionDanger.CROCODILE_DANGER_LEVEL, cr.whatDangerLevel());
    }

    @Test @DisplayName("Test of Crocodile inheritancePath()")
    void testInheritancePath() {
        assertEquals("Crocodile < Reptile < Specimen", cr.inheritancePath());
    }
}