package packTest;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import packSpecimenHierarchy.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test of Turtle class methods")
class TurtleTest {

    static Turtle tu;

    @BeforeAll
    static void setUpBeforeAll() {
        tu = new Turtle("TurtleExample" , new GPS(0,0));
    }

    @Test @DisplayName("Test of Turtle getName()")
    void testGetName() {
        assertEquals("TurtleExample", tu.getName());
    }

    @Test @DisplayName("Test of Turtle feeding()")
    void testFeeding() {
        assertEquals(Reptile.REPTILE_FEEDING, tu.feeding());
    }

    @Test @DisplayName("Test of Turtle sound()")
    void testSound() {
        assertEquals(Reptile.REPTILE_SOUND, tu.sound());
    }

    @Test @DisplayName("Test of BlackRhino inheritancePath()")
    void testInheritancePath() {
        assertEquals("Turtle < Reptile < Specimen", tu.inheritancePath());
    }
}