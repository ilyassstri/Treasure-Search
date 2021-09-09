import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{

    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        prepare();
        setBackground("BG.png");
    }
    
    private void prepare()
    {
        MaceTwo maceTwo = new MaceTwo();
        addObject(maceTwo,395,350);
        maceTwo.setLocation(370,346);
        
        Water water7 = new Water();
        addObject(water7,848,565);

        Water water8 = new Water();
        addObject(water8,948,565);

        Water water = new Water();
        addObject(water,253,565);

        Water water2 = new Water();
        addObject(water2,357,565);

        Water water3 = new Water();
        addObject(water3,460,565);

        Water water4 = new Water();
        addObject(water4,560,565);


        Ladder ladder = new Ladder();
        addObject(ladder,25,400);

        Mace mace = new Mace();
        addObject(mace,146,530);

        Mace mace2 = new Mace();
        addObject(mace2,872,550);
        mace2.setLocation(834,530);

        Mace mace3 = new Mace();
        addObject(mace3,934,530);
        mace3.setLocation(900,530);

        Mace mace4 = new Mace();
        addObject(mace4,957,537);
        mace4.setLocation(965,530);
        Mushroom mushroom = new Mushroom();
        addObject(mushroom,631,500);

        Tree tree = new Tree();
        addObject(tree,735,384);
        

        Finish2 finish = new Finish2();
        addObject(finish,951,367);

        finish.setLocation(955,370);
        Coint coint = new Coint();
        addObject(coint,298,253);
        coint.setLocation(300,261);
        Coint coint2 = new Coint();
        addObject(coint2,500,263);
        Coint coint3 = new Coint();
        addObject(coint3,941,276);
        coint3.setLocation(943,276);
        removeObject(ladder);
        Coint coint4 = new Coint();
        addObject(coint4,155,272);
        coint4.setLocation(155,261);
        coint4.setLocation(145,260);
        Peta peta = new Peta();
        addObject(peta,236,273);
        peta.setLocation(220,259);
        Crate crate = new Crate();
        addObject(crate,739,495);
        Coint coint5 = new Coint();
        addObject(coint5,741,428);

        removeObject(mace);
        Coint coint6 = new Coint();
        addObject(coint6,669,445);
        Bush bush = new Bush();
        addObject(bush,164,499);
        Stone stone = new Stone();
        addObject(stone,230,305);

        Jumper jumper = new Jumper(80, 100);
        addObject(jumper,59,471);
        Mace mace5 = new Mace();
        addObject(mace5,561,382);

        BackMenu backMenu = new BackMenu();
        addObject(backMenu,911,57);
        Platform platform = new Platform();
        addObject(platform,50,561);
        Platform platform2 = new Platform();
        addObject(platform2,150,561);
        Platform platform3 = new Platform();
        addObject(platform3,167,372);
        Platform platform4 = new Platform();
        addObject(platform4,267,372);
        Platform platform5 = new Platform();
        addObject(platform5,663,561);
        Platform platform6 = new Platform();
        addObject(platform6,752,561);
        Platform platform7 = new Platform();
        addObject(platform7,951,442);
        Platform platform8 = new Platform();
        addObject(platform8,480,373);
    }
    
}
