import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mace here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mace extends obstacle
{
    /**
     * Act - do whatever the Mace wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Mace()
    {
        this(50, 50);
        setImage("Saw.png");
    }
    
    public Mace(int width, int height)
    {
        GreenfootImage image = getImage();
        image.scale(width, height);
        setImage(image);
    }
    
    public void act()
    {
        // Add your action code here.
        move(0);
        turn(-3);
        move(0);
        turn(5);
    }
}
