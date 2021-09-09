import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LogoGreenfoot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LogoGreenfoot extends MyAssetMenu
{
    /**
     * Act - do whatever the LogoGreenfoot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public LogoGreenfoot()
    {
        this(160, 60);
        setImage("greenfootlogo (1).jpg");
    }
    
    public LogoGreenfoot(int width, int height)
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
