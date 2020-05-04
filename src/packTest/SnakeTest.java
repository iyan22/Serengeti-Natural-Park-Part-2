package packTest;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import packSpecimenHierarchy.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test of BlackRhino class methods")
class SnakeTest {

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
        assertEquals(Herbivorous.HERBIVOROUS_FEEDING, br.feeding());
    }

    @Test @DisplayName("Test of BlackRhino sound()")
    void testSound() {
        assertEquals(BlackRhino.BLACKRHINO_SOUND, br.sound());
    }

    @Test @DisplayName("Test of BlackRhino walk()")
    void testWalk() {
        assertEquals(Mammal.MAMMAL_WALK, br.walk());
    }

    @Test @DisplayName("Test of BlackRhino whatDangerLevel()")
    void whatDangerLevel() {
        assertEquals(ExtinctionDanger.BLACKRHINO_DANGER_LEVEL, br.whatDangerLevel());
    }

    @Test @DisplayName("Test of BlackRhino inheritancePath()")
    void testInheritancePath() {
        assertEquals("BlackRhino < Herbivorous < Mammal < Specimen", br.inheritancePath());
    }
}