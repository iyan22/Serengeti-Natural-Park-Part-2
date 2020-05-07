package packTest;

import org.junit.jupiter.api.*;
import packSpecimenHierarchy.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test of BlackRhino class methods")
class BlackRhinoTest {

    static BlackRhino br;

    @BeforeAll
    static void setUpBeforeAll() {
        br = new BlackRhino("BlackRhinoExample" , new GPS(0,0));
    }

    @Test @DisplayName("Test of BlackRhino getName()")
    void testGetName() {
        assertEquals("BlackRhinoExample", br.getName());
    }

    @Test @DisplayName("Test of BlackRhino feeding()")
    void testFeeding() {
        assertEquals(BlackRhino.getHerbivorousFeeding(), br.feeding());
    }

    @Test @DisplayName("Test of BlackRhino sound()")
    void testSound() {
        assertEquals(BlackRhino.getHerbivorousSound(), br.sound());
    }

    @Test @DisplayName("Test of BlackRhino walk()")
    void testWalk() {
        assertEquals(BlackRhino.getHerbivorousWalk(), br.walk());
    }

    @Test @DisplayName("Test of BlackRhino whatDangerLevel()")
    void whatDangerLevel() {
        assertEquals(BlackRhino.getBlackRhinoDangerLevel(), br.whatDangerLevel());
    }

    @Test @DisplayName("Test of BlackRhino inheritancePath()")
    void testInheritancePath() {
        assertEquals("BlackRhino < Herbivorous < Mammal < Specimen", br.inheritancePath());
    }
}