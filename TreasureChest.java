import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TreasureChest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TreasureChest extends Asset
{
    /**
     * Act - do whatever the TreasureChest wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public TreasureChest()
    {
        this(50, 80);
        setImage("1-1x.png");
    }
    
    public TreasureChest(int width, int height)
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
