import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coint extends Actor
{
    public Coint()
    {
        this(25, 25);
        setImage("image 1.png");
    }
    
    public Coint(int width, int height)
    {
        GreenfootImage image = getImage();
        image.scale(width, height);
        setImage(image);
    }
    
    public void act()
    {
        move(0);
        turn(3);
        move(0);
        turn(-1);
    }
}
