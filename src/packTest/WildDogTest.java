package packTest;

import org.junit.jupiter.api.*;
import packSpecimenHierarchy.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test of WildDog class methods")
class WildDogTest {

    static WildDog wd;

    @BeforeAll
    static void setUpBeforeAll() {
        wd = new WildDog("WildDogExample" , new GPS(0,0));
    }

    @Test @DisplayName("Test of WildDog getName()")
    void testGetName() {
        assertEquals("WildDogExample", wd.getName());
    }

    @Test @DisplayName("Test of WildDog feeding()")
    void testFeeding() {
        assertEquals(Carnivorous.getCarnivorousFeeding(), wd.feeding());
    }

    @Test @DisplayName("Test of WildDog sound()")
    void testSound() {
        assertEquals(WildDog.getWildDogSound(), wd.sound());
    }

    @Test @DisplayName("Test of WildDog walk()")
    void testWalk() {
        assertEquals(WildDog.getWildDogWalk(), wd.walk());
    }

    @Test @DisplayName("Test of WildDog whatDangerLevel()")
    void whatDangerLevel() {
        assertEquals(WildDog.getWildDogDangerLevel(), wd.whatDangerLevel());
    }

    @Test @DisplayName("Test of WildDog inheritancePath()")
    void testInheritancePath() {
        assertEquals("WildDog < Carnivorous < Mammal < Specimen", wd.inheritancePath());
    }

}