import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    GreenfootSound myMusicMenu = new GreenfootSound("coba.wav");
    
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
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

        About about = new About();
        addObject(about,373,380);
        about.setLocation(345,400);
        Help help = new Help();
        addObject(help,484,400);
        Story story = new Story();
        addObject(story,635,400);

        Start start = new Start();
        addObject(start,500,272);
        start.setLocation(485,280);


        NameGame nameGame = new NameGame();
        addObject(nameGame,485,143);

        TreasureChest treasureChest = new TreasureChest();
        addObject(treasureChest,750,450);
        Peta peta = new Peta(130, 140);
        addObject(peta,666,286);
        removeObject(peta);

        removeObject(treasureChest);

    }
    
    public void act()
    {
        myMusicMenu.play();
        
    }
}
