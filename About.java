import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class About here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class About extends MyAssetMenu
{
    /**
     * Act - do whatever the About wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public About()
    {
        this(50, 50);
        setImage("about.png");
    }
    
    public About(int width, int height)
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
            Greenfoot.setWorld(new AboutMenu());
        }
    }
}
