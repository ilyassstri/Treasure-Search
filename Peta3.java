import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Peta3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Peta3 extends Asset
{
    /**
     * Act - do whatever the Peta3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Peta3()
    {
        this(30, 30);
        setImage("treasure-map-153425_960_720.png");
    }
    
    public Peta3(int width, int height)
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
