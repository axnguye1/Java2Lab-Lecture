import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaterTest {

    @Test
    void consume() {
        Water w = new Water();
        w.consume();

    }

    @Test
    void destroy() {
        Water w = new Water();
        w.destroy();
        assertEquals("Empty Bottle", w.getItemName());
    }


}