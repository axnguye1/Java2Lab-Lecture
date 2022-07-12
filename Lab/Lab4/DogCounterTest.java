import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class DogCounterTest {

    @org.junit.jupiter.api.Test
    void testDogCounting() {
        Dog d = new Dog();

        Assertions.assertEquals(1,d.compareTo() );
    }

    @org.junit.jupiter.api.Test
    void testPrintDogCount() {
    }

    @org.junit.jupiter.api.Test
    void testReset() {
    }
}