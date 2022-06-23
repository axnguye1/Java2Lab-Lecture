import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IronHelmetTest {

    @Test
    void equip() {
        IronHelmet ih = new IronHelmet();
        ih.equip();
        assertTrue(true);

    }

    @Test
    void destroy() {
        IronHelmet ih = new IronHelmet();
        ih.destroy();
        assertEquals("Iron Nugget",ih.getName());
    }
}