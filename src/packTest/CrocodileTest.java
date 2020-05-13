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
        assertEquals(Crocodile.getCrocodileFeeding(), cr.feeding());
    }

    @Test @DisplayName("Test of Crocodile sound()")
    void testSound() {
        assertEquals(Crocodile.getCrocodileSound(), cr.sound());
    }

    @Test @DisplayName("Test of Crocodile whatDangerLevel()")
    void testWhatDangerLevel() {
        assertEquals(Crocodile.getCrocodileDangerLevel(), cr.whatDangerLevel());
    }

    @Test @DisplayName("Test of Crocodile inheritancePath()")
    void testInheritancePath() {
        assertEquals("Crocodile < Reptile < Specimen", cr.inheritancePath());
    }
}