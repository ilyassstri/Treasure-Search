import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{

    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Level3()
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
        Tree tree = new Tree();
        addObject(tree,524,383);
        MaceTwo maceTwo = new MaceTwo();
        addObject(maceTwo,390,372);
        
        MaceTwo maceTwo2 = new MaceTwo();
        addObject(maceTwo2,857,377);
        maceTwo2.setLocation(828,384);
        Water water = new Water();
        addObject(water,52,578);
        Water water2 = new Water();
        addObject(water2,157,578);
        Water water3 = new Water();
        addObject(water3,262,578);
        Water water4 = new Water();
        addObject(water4,360,577);
        Water water5 = new Water();
        addObject(water5,662,577);
        Water water6 = new Water();
        addObject(water6,766,577);
        Water water7 = new Water();
        addObject(water7,848,572);

        Mace mace = new Mace();
        addObject(mace,676,562);
        mace.setLocation(655,545);

        Mace mace2 = new Mace();
        addObject(mace2,360,481);
        
        Crate crate = new Crate();
        addObject(crate,490,495);
        Crate crate2 = new Crate();
        addObject(crate2,540,495);
        Tree2 tree2 = new Tree2();
        addObject(tree2,957,500);
        Bush bush = new Bush();
        addObject(bush,323,218);

        Coint coint = new Coint();
        addObject(coint,129,407);
        Coint coint2 = new Coint();
        addObject(coint2,234,201);
        Coint coint3 = new Coint();
        addObject(coint3,312,200);
        Coint coint4 = new Coint();
        addObject(coint4,518,239);
        Coint coint5 = new Coint();
        addObject(coint5,526,492);

        
        Peta peta = new Peta();
        addObject(peta,953,476);
        Coint coint6 = new Coint();
        addObject(coint6,521,378);

        Finish3 finish = new Finish3();
        addObject(finish,759,308);

        Coint coint7 = new Coint();
        addObject(coint7,945,362);
        Coint coint8 = new Coint();
        addObject(coint8,748,220);
        
        Mace mace3 = new Mace();
        addObject(mace3,741,543);
        mace2.setLocation(333,473);
        Mace mace4 = new Mace();
        addObject(mace4,825,545);
        Mushroom mushroom = new Mushroom();
        addObject(mushroom,178,423);

        Jumper jumper = new Jumper(80, 100);
        addObject(jumper,59,390);
        mace4.setLocation(845,536);
        mace3.setLocation(755,532);
        mace.setLocation(671,531);

        BackMenu backMenu = new BackMenu();
        addObject(backMenu,911,57);
        Platform platform = new Platform();
        addObject(platform,50,481);
        Platform platform2 = new Platform();
        addObject(platform2,149,481);
        Platform platform3 = new Platform();
        addObject(platform3,245,282);
        Platform platform4 = new Platform();
        addObject(platform4,310,282);
        Platform platform5 = new Platform();
        addObject(platform5,463,560);
        Platform platform6 = new Platform();
        addObject(platform6,560,560);
        Platform platform7 = new Platform();
        addObject(platform7,950,562);
        Platform platform8 = new Platform();
        addObject(platform8,747,379);

    }
}
