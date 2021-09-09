    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
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

        Water water = new Water();
        addObject(water,253,565);

        water.setLocation(247,561);
        Directions directions = new Directions();
        addObject(directions,37,487);
        Bush bush = new Bush();
        addObject(bush,362,499);
        Tree tree = new Tree();
        addObject(tree,117,360);
        tree.setLocation(110,383);

        Mace mace = new Mace();
        addObject(mace,550,300);

        Peta peta = new Peta();
        addObject(peta,571,327);
        peta.setLocation(644,239);
        peta.setLocation(637,215);
        Crate crate = new Crate();
        addObject(crate,674,235);
        peta.setLocation(675,184);

        Finish finish = new Finish();
        addObject(finish,953,390);

        Jumper jumper = new Jumper(80, 100);
        addObject(jumper,59,470);

        Mace mace2 = new Mace();
        addObject(mace2,720,341);
        mace2.setLocation(704,373);
        mace2.setLocation(904,468);

        Coint coint = new Coint();
        addObject(coint,452,450);
        coint.setLocation(448,467);
        Coint coint2 = new Coint();
        addObject(coint2,535,464);
        coint2.setLocation(520,464);
        Coint coint3 = new Coint();
        addObject(coint3,606,468);
        coint3.setLocation(599,465);
        Coint coint4 = new Coint();
        addObject(coint4,738,223);
        coint4.setLocation(742,230);
        coint4.setLocation(744,226);

        removeObject(mace2);
        Mace mace3 = new Mace();
        addObject(mace3,471,298);
        mace3.setLocation(493,300);
        Coint coint5 = new Coint();
        addObject(coint5,680,468);
        coint5.setLocation(678,464);
        MaceTwo maceTwo = new MaceTwo();
        addObject(maceTwo,400,297);
        Mace mace4 = new Mace();
        addObject(mace4,247,518);
        mace4.setLocation(246,523);
        mace4.setLocation(247,522);
        mace4.setLocation(248,529);

        BackMenu backMenu = new BackMenu();
        addObject(backMenu,911,57);

        Platform platform = new Platform();
        addObject(platform,50,560);
        Platform platform2 = new Platform();
        addObject(platform2,144,560);
        Platform platform3 = new Platform();
        addObject(platform3,351,560);
        Platform platform4 = new Platform();
        addObject(platform4,451,560);
        Platform platform5 = new Platform();
        addObject(platform5,551,560);
        Platform platform6 = new Platform();
        addObject(platform6,651,560);
        Platform platform7 = new Platform();
        addObject(platform7,751,560);
        Platform platform8 = new Platform();
        addObject(platform8,851,560);
        Platform platform9 = new Platform();
        addObject(platform9,951,560);
        Platform platform10 = new Platform();
        addObject(platform10,951,461);
        Platform platform11 = new Platform();
        addObject(platform11,631,300);
        Platform platform12 = new Platform();
        addObject(platform12,731,300);
        
    }
}
