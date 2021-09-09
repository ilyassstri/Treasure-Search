import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crate extends Asset
{
    /**
     * Act - do whatever the Crate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Crate()
    {
        this(50, 50);
        setImage("Crate.png");
    }
    
    public Crate(int width, int height)
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
