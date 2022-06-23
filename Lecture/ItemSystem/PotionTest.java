import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PotionTest {

    @Test
    void consume() {
        Potion p = new Potion();
        p.consume();
    }

    @Test
    void destroy() {
        Potion p = new Potion();
        p.destroy();
        assertEquals("Broken Bottles", p.getItemName());
    }
}