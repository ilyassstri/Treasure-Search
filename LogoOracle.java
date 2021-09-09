import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LogoOracle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LogoOracle extends MyAssetMenu
{
    /**
     * Act - do whatever the LogoOracle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public LogoOracle()
    {
        this(160, 60);
        setImage("Oracle-Corporation.jpg");
    }
    
    public LogoOracle(int width, int height)
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
