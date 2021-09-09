import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Left here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Left extends Tombol
{
    /**
     * Act - do whatever the Left wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Left()
    {
        this(100, 50);
        setImage("Vectorleft.png");
    }
    
    public Left(int width, int height)
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
