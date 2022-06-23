import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrowTest {

    @Test
    void testConsume() {
        Arrow a = new Arrow();
        a.consume();

    }

    @Test
    void testDestroy() {
        Arrow a = new Arrow();
        a.destroy();
        assertEquals("Arrows", a.getItemName());
    }


}