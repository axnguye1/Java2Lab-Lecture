package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaterTest {

    @Test
    void consume() {
        Water w = new Water();
        w.consume();
        Assertions.assertEquals(0,w.getQuantity());
        //assert expected value of water, expected = actual || pass

    }

    @Test
    void destroy() {
        Water w = new Water();
        w.destroy();
        Assertions.assertEquals("Empty Bottle", w.getItemName());
    }


}