import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Peta4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Peta4 extends Asset
{
    /**
     * Act - do whatever the Peta4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Peta4()
    {
        this(30, 30);
        setImage("treasure-map-153425_960_720.png");
    }
    
    public Peta4(int width, int height)
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
