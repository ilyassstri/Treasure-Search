import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends MyAssetMenu
{
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Start()
    {
        this(100,100);
        setImage("play.png");
    }
    
    public Start(int width, int height)
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
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
