import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ladder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ladder extends Actor
{
    /**
     * Act - do whatever the Ladder wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Ladder()
    {
        this(300, 355);
        setImage("stairs_full.png");
    }
    
    public Ladder(int width, int height)
    {
        GreenfootImage image = getImage();
        image.scale(width, height);
        setImage(image);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
