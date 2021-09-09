import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Restart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Restart extends MyAssetMenu
{
    /**
     * Act - do whatever the Restart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Restart()
    {
        this(50, 50);
        setImage("restart.png");
    }
    
    public Restart(int width, int height)
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
