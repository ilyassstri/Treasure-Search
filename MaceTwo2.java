import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MaceTwo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MaceTwo2 extends obstacle
{
    /**
     * Act - do whatever the MaceTwo2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public MaceTwo2()
    {
        this(50, 50);
        setRotation(90);
        setImage("Mace.png");
    }
    
    public MaceTwo2(int width, int height)
    {
        GreenfootImage image = getImage();
        image.scale(width, height);
        setImage(image);
    }
    
    
    
    
}
