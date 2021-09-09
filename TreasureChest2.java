import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TreasureChest2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TreasureChest2 extends Asset
{
    /**
     * Act - do whatever the TreasureChest2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public TreasureChest2()
    {
        this(50, 80);
        setImage("1-1x.png");
    }
    
    public TreasureChest2(int width, int height)
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
