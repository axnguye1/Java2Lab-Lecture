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
    private int Speed;


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
    public int getSpeed(){
        return this.Speed;
    }
    /**
     * @since 6/15/22
     * @return returns values for speed Y value
     */

    //commands or setters
    public void setDirection(Direction newDirection){
        this.hisDirection = newDirection;
    }
    public void setSpeedX(int newSpeed){
        this.Speed= newSpeed;
    }

/**
 * @since 6/15/22
 * @custom.ensure The move method allows inputs to control SpeedX and SpeedY(for ex: if input W, then Direction.UP and speed is > 0)
 * @custom.ensure 10 < getY() < 490
 * @custom.ensure  10 < getX() < 190
 */
    public void move() {
        //new position is dependent on the old position, speed and current dirc.

        if (hisDirection == Direction.UP) {
            hisCenterLocation.setY(hisCenterLocation.getY() - this.Speed);
        } else if (hisDirection == Direction.DOWN) {
            hisCenterLocation.setY(hisCenterLocation.getY() + this.Speed);
        } else if (hisDirection == Direction.LEFT) {
            hisCenterLocation.setX(hisCenterLocation.getX() - this.Speed);

        }else if(hisDirection == Direction.RIGHT) {
            hisCenterLocation.setX(hisCenterLocation.getX() + this.Speed);
        }
    }


    public void setAlive(boolean value){
        this.isAlive = value;
    }




}//end class
