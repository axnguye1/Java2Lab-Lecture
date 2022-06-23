import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmptyBottleTest {

    @Test
    void fill() {
        EmptyBottle eb = new EmptyBottle();
        eb.fill();


    }
    @Test
    void destroy(){
        EmptyBottle eb = new EmptyBottle();
        eb.destroy();
        assertEquals("Broken Bottles", eb.getItemName());

    }
}