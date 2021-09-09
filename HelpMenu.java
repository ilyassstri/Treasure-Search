import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HelpMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpMenu extends World
{

    /**
     * Constructor for objects of class HelpMenu.
     * 
     */
    public HelpMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        prepare();
        setBackground("BG.png");
    }
    
    private void prepare()
    {
        Back back = new Back();
        addObject(back,112,108);
        back.setLocation(96,61);
        NameHelp nameHelp = new NameHelp();
        addObject(nameHelp,476,108);
        TextHelp1 textHelp1 = new TextHelp1();
        addObject(textHelp1,168,230);
        TextHelp2 textHelp2 = new TextHelp2();
        addObject(textHelp2,158,291);
        TextHelp3 textHelp3 = new TextHelp3();
        addObject(textHelp3,169,340);
        TextHelp4 textHelp4 = new TextHelp4();
        addObject(textHelp4,196,398);
        textHelp4.setLocation(236,405);
        TextHelp5 textHelp5 = new TextHelp5();
        addObject(textHelp5,244,460);

        JumperActor jumperActor = new JumperActor();
        addObject(jumperActor,484,294);
        textHelp1.setLocation(660,307);
        textHelp2.setLocation(326,298);
        textHelp3.setLocation(485,195);
        removeObject(textHelp5);
        textHelp4.setLocation(500,409);
    }
}
