import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StoryMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StoryMenu extends World
{

    /**
     * Constructor for objects of class StoryMenu.
     * 
     */
    public StoryMenu()
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
        NameStory nameStory = new NameStory();
        addObject(nameStory,476,108);
        TextStory textStory = new TextStory();
        addObject(textStory,360,221);
        Peta2 peta2 = new Peta2();
        addObject(peta2,660,232);
        TextStory2 textStory2 = new TextStory2();
        addObject(textStory2,190,272);
        Key2 key2 = new Key2();
        addObject(key2,402,300);
        key2.setLocation(320,280);
        TextStory3 textStory3 = new TextStory3();
        addObject(textStory3,549,277);
        TreasureChest2 treasureChest2 = new TreasureChest2();
        addObject(treasureChest2,807,261);
        treasureChest2.setLocation(792,265);
        TextStory4 textStory4 = new TextStory4();
        addObject(textStory4,484,327);
        Mace2 mace2 = new Mace2();
        addObject(mace2,186,421);
        mace2.setLocation(164,395);
        MaceTwo2 maceTwo2 = new MaceTwo2();
        addObject(maceTwo2,231,396);
        Water2 water2 = new Water2();
        addObject(water2,318,393);
        water2.setLocation(310,394);
        TextStory5 textStory5 = new TextStory5();
        addObject(textStory5,467,479);
    }
}
