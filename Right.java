import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Right here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Right extends Tombol
{
    /**
     * Act - do whatever the Right wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Right()
    {
        this(100, 50);
        setImage("Vector 2 (1).png");
    }
    
    public Right(int width, int height)
    {
        GreenfootImage image = getImage();
        image.scale(width, height);
        setImage(image);
    }
    
    public void act()
    {
        // Add your action code here.
        
        if(Greenfoot.mousePressed(this))
        {
            move();
        }
    }
}