import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Water2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Water2 extends obstacle
{
    /**
     * Act - do whatever the Water2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Water2()
    {
        this(50, 50);
        setImage("Water1000.png");
    }
    
    public Water2(int width, int height)
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
