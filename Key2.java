import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Key2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Key2 extends Actor
{
    /**
     * Act - do whatever the Key2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Key2()
    {
        this(80, 80);
        setImage("—Pngtree—golden key golden key gold_39553302.png");
    }
    
    public Key2(int width, int height)
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
