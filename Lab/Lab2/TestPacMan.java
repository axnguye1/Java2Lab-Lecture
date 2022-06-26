import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;


public class TestPacMan {

    // declare my test fixture (the set of objects I'm going to work with)
    PacMan rep1;
    PacMan rep2;
    PacMan rightWall;
    PacMan leftWall;
    PacMan topWall;
    PacMan bottomWall;
    PacMan lowerLeftCorner;
    PacMan lowerRightCorner;
    PacMan upperLeftCorner;
    PacMan upperRightCorner;

    @BeforeEach
    public void setup() {
        rep1 = new PacMan( new PixelLocation( 50, 50) );
        rep2 = new PacMan( new PixelLocation( 100,100) );
        rightWall = new PacMan( new PixelLocation( 190,100) );
        leftWall = new PacMan( new PixelLocation( 10,100) );
        topWall = new PacMan( new PixelLocation( 100,10) );
        bottomWall = new PacMan( new PixelLocation( 100,490) );
        lowerLeftCorner = new PacMan( new PixelLocation( 10,490) );
        lowerRightCorner = new PacMan( new PixelLocation( 190,490) );
        upperLeftCorner = new PacMan( new PixelLocation( 10,10) );
        upperRightCorner  = new PacMan( new PixelLocation( 190,10) );
    }

    @Test
    public void testInitialState() {

        // test rep1 initial state
        // assertEquals (expectation,  actual)
        assertEquals(50, rep1.getLocation().getX());
        assertEquals(50, rep1.getLocation().getY());
        // test rep2 initial state
        assertEquals(100, rep2.getLocation().getX());
        assertEquals(100, rep2.getLocation().getY());
        // complete this for turning in assignment....\

        //test right wall
        assertEquals(190,rightWall.getLocation().getX());
        assertEquals(100,rightWall.getLocation().getY());
        //test left wall
        assertEquals(10,leftWall.getLocation().getX());
        assertEquals(100,leftWall.getLocation().getY());
        //test topWall
        assertEquals(100,topWall.getLocation().getX());
        assertEquals(10,topWall.getLocation().getY());
        //test bottomWall
        assertEquals(100,bottomWall.getLocation().getX());
        assertEquals(490,bottomWall.getLocation().getY());
        //test lower left corner
        assertEquals(10,lowerLeftCorner.getLocation().getX());
        assertEquals(490,lowerLeftCorner.getLocation().getY());
        //test lower right corner
        assertEquals(190,lowerRightCorner.getLocation().getX());
        assertEquals(490,lowerRightCorner.getLocation().getY());
        //test upper left corner
        assertEquals(10,upperLeftCorner.getLocation().getX());
        assertEquals(10,upperLeftCorner.getLocation().getY());
        //test upper right corner
        assertEquals(190,upperRightCorner.getLocation().getX());
        assertEquals(10,upperRightCorner.getLocation().getY());

    }

    @Test
    public void testAlive() {
        assertTrue(rep1.alive());
        rep1.setAlive(false);
        assertFalse(rep1.alive());
    }

    @Test
    public void testMoveRight() {
        // test moving rep1
        rep1.move();
        assertEquals(51, rep1.getLocation().getX());
        assertEquals(50, rep1.getLocation().getY());
        // test moving rep2
        rep2.move();
        assertEquals(101, rep2.getLocation().getX());
        assertEquals(100, rep2.getLocation().getY());
        // test moving rightWall
        rightWall.move();
        assertEquals(190, rightWall.getLocation().getX());
        assertEquals(100, rightWall.getLocation().getY());

    }

    @Test
    public void testMoveLeft() {
        // test moving rep1
        rep1.setDirection(PacMan.Direction.LEFT);
        rep1.move();
        assertEquals(49, rep1.getLocation().getX());
        assertEquals(50, rep1.getLocation().getY());
        // test moving rep2
        rep2.setDirection(PacMan.Direction.LEFT);
        rep2.move();
        assertEquals(99, rep2.getLocation().getX());
        assertEquals(100, rep2.getLocation().getY());


    }

    @Test
    public void testMoveUp() {
        // test moving rep1
        rep1.setDirection(PacMan.Direction.UP);
        rep1.move();
        assertEquals(50, rep1.getLocation().getX());
        assertEquals(49, rep1.getLocation().getY());
        // test moving rep2
        rep2.setDirection(PacMan.Direction.UP);
        rep2.move();
        assertEquals(100, rep2.getLocation().getX());
        assertEquals(99, rep2.getLocation().getY());

    }

    @Test
    public void testMoveDown() {
        // test moving rep1
        rep1.setDirection(PacMan.Direction.DOWN);
        rep1.move();
        assertEquals(50, rep1.getLocation().getX());
        assertEquals(51, rep1.getLocation().getY());
        // test moving rep2
        rep2.setDirection(PacMan.Direction.DOWN);
        rep2.move();
        assertEquals(100, rep2.getLocation().getX());
        assertEquals(101, rep2.getLocation().getY());

    }


}//end class
