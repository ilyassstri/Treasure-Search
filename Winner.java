import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Winner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Winner extends World
{
    //GreenfootSound myMusicMenu = new GreenfootSound("136441__iod14__champion-fun.mp3");
    /**
     * Constructor for objects of class Winner.
     * 
     */
    public Winner()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        prepare();
        setBackground("BG.png");
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        NameWinner1 nameWinner1 = new NameWinner1();
        addObject(nameWinner1,484,109);
        NameWinner2 nameWinner2 = new NameWinner2();
        addObject(nameWinner2,485,195);
        Restart restart = new Restart();
        addObject(restart,544,325);
        BackMenu backMenu = new BackMenu();
        addObject(backMenu,431,322);
        backMenu.setLocation(430,324);
    }
    
    public void act()
    {
        
    }
}
