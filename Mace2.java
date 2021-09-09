import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mace2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mace2 extends obstacle
{
    /**
     * Act - do whatever the Mace2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Mace2()
    {
        this(50, 50);
        setImage("Saw.png");
    }
    
    public Mace2(int width, int height)
    {
        GreenfootImage image = getImage();
        image.scale(width, height);
        setImage(image);
    }
    
    public void act()
    {
    }
}
