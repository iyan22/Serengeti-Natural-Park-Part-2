package packTest;

import org.junit.jupiter.api.*;
import packSpecimenHierarchy.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test of Snake class methods")
class SnakeTest {

    static Snake sn;

    @BeforeAll
    static void setUpBeforeAll() {
        sn = new Snake("SnakeExample" , new GPS(0,0));
    }

    @Test @DisplayName("Test of Snake getName()")
    void testGetName() {
        assertEquals("SnakeExample", sn.getName());
    }

    @Test @DisplayName("Test of Snake feeding()")
    void testFeeding() {
        assertEquals(Reptile.getReptileFeeding(), sn.feeding());
    }

    @Test @DisplayName("Test of Snake sound()")
    void testSound() {
        assertEquals(Reptile.getReptileSound(), sn.sound());
    }

    @Test @DisplayName("Test of Snake inheritancePath()")
    void testInheritancePath() {
        assertEquals("Snake < Reptile < Specimen", sn.inheritancePath());
    }
}