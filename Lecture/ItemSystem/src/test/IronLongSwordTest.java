package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IronLongSwordTest {

    @Test
    void equip() {
        IronLongSword ils = new IronLongSword();
        ils.equip();
        assertTrue(true);
    }

    @Test
    void destroy() {
        IronLongSword ils = new IronLongSword();
        ils.destroy();
        Assertions.assertEquals("Sword Hilt",ils.getName());
    }
}