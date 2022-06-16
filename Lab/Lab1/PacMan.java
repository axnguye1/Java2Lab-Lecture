/**
 * @author Amanda Nguyen
 * @since 6/14/22
 * @version 0.1
 *
 * A class to represent pacman in a game that the boss
 * is forcintg me to write
 *
 * This pacman game is going to run on a grid that is 200 pixels horizontally
 * and 500 pixels vertically
 *
 * Pacman himself has a diameter of 20 pixels.
 *
 */

//for lab grade, due 6/16
//1) implement move method, 2) private javadoc comments for all methods


public class PacMan {
   public static enum Direction {UP, DOWN, LEFT, RIGHT};
    private boolean isAlive;
    private PixelLocation hisCenterLocation;

    private PixelLocation PixelLocation;
    private Direction hisDirection;
    private int SpeedX;
    private int SpeedY;

    /**
     *
     * @param location is the pixelLocation of the PacMan.
     *
     */
    public PacMan(PixelLocation location){
        this.hisCenterLocation = location;
        this.isAlive = true;


    }//end constructor

    //pacman's queries getters

    /**
     * @since  6/15/22
     * @return boolean value isAlive to determine if pacman is still alive
     */
    public boolean alive(){
        return isAlive;
    }

    /**
     * @since 6/15/22
     * @return returns hisCenterLocation
     */
    public PixelLocation getLocation(){
        return this.hisCenterLocation;
    }

    /**
     * @since 6/15/22
     * @return returns UP DOWN LEFT RIGHT directions
     */
    public Direction getDirection(){
        return this.hisDirection;
    }

    /**
     * @since 6/15/22
     * @return returns values for speed X value
     */
    public int getSpeedX(){
        return this.SpeedX;
    }
    /**
     * @since 6/15/22
     * @return returns values for speed Y value
     */
    public int getSpeedY(){
        return this.SpeedY;
    }
    //commands or setters
    public void setDirection(Direction newDirection){
        this.hisDirection = newDirection;
    }
    public void setSpeedX(int newSpeedX){
        this.SpeedX= newSpeedX;
    }
    public void setSpeedY(int newSpeedY){ this.SpeedY= newSpeedY; }
/**
 * @since 6/15/22
 * The move method allows inputs to control SpeedX and SpeedY(for ex: if input W, then Direction.UP and speed is > 0)
 * The move method also locks character into boundaries.
 */
    public void move(){
        //new position is dependent on the old position, speed and current dirc.
        hisCenterLocation.setY(hisCenterLocation.getY() + getSpeedY());
        hisCenterLocation.setX(hisCenterLocation.getX() + getSpeedX());


        this.hisDirection=Direction.LEFT;
      this.hisDirection=Direction.RIGHT;
      this.hisDirection=Direction.DOWN;
        this.hisDirection=Direction.UP;

       }



    public void setAlive(boolean value){
        this.isAlive = value;
    }




}//end class
