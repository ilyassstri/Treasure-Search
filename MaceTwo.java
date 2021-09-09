import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MaceTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MaceTwo extends obstacle
{
    /**
     * Act - do whatever the MaceTwo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public MaceTwo()
    {
        this(50, 50);
        setRotation(90);
        setImage("Mace.png");
    }
    
    public MaceTwo(int width, int height)
    {
        GreenfootImage image = getImage();
        image.scale(width, height);
        setImage(image);
    }
    
    public void act()
    {
        // Add your action code here.
        move(1);
        moveEnemy();
    }
    
    public void moveEnemy()
    {
        // move(5);
        setLocation(getX(), getY());
        if(isAtEdge()) {
            turn(180);
        }
    }
    
    
}
