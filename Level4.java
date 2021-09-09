import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level4 extends World
{

    /**
     * Constructor for objects of class Level4.
     * 
     */
    public Level4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        
        prepare();
        setBackground("BG.png");
    }
    
    public void prepare()
    {

        Tree tree = new Tree();
        addObject(tree,576,303);

        Ladder ladder = new Ladder();
        addObject(ladder,29,420);

        Directions directions = new Directions();
        addObject(directions,115,489);
        
        MaceTwo maceTwo2 = new MaceTwo();
        addObject(maceTwo2,678,313);
        MaceTwo maceTwo = new MaceTwo();
        addObject(maceTwo,419,310);
        MaceTwo maceTwo3 = new MaceTwo();
        addObject(maceTwo3,418,152);
        MaceTwo maceTwo4 = new MaceTwo();
        addObject(maceTwo4,686,458);
        
        Water water3 = new Water();
        addObject(water3,710,575);
        Water water4 = new Water();
        addObject(water4,931,572);
        water4.setLocation(920,571);
        Water water5 = new Water();
        addObject(water5,949,572);
        Water water = new Water();
        addObject(water,204,576);

        Water water2 = new Water();
        addObject(water2,690,574);
        water2.setLocation(690,573);

        Bush bush = new Bush();
        addObject(bush,401,498);

        Mace mace = new Mace();
        addObject(mace,198,312);
        mace.setLocation(205,311);
        
        Mace mace2 = new Mace();
        addObject(mace2,209,551);
        Mace mace3 = new Mace();
        addObject(mace3,205,434);
        Mushroom mushroom = new Mushroom();
        addObject(mushroom,310,250);
        

        Finish4 finish = new Finish4();
        addObject(finish,961,288);

        Mace mace4 = new Mace();
        addObject(mace4,952,461);
        Peta peta = new Peta();
        addObject(peta,323,456);

        Coint coint = new Coint();
        addObject(coint,101,233);
        Coint coint2 = new Coint();
        addObject(coint2,100,165);
        Coint coint3 = new Coint();
        addObject(coint3,305,161);
        
        
        
        Coint coint4 = new Coint();
        addObject(coint4,582,360);
        Coint coint5 = new Coint();
        addObject(coint5,777,440);
        Coint coint6 = new Coint();
        addObject(coint6,841,438);
        Tree2 tree2 = new Tree2();
        addObject(tree2,819,498);

        coint2.setLocation(101,186);
        coint.setLocation(102,124);

        Jumper jumper = new Jumper(80, 100);
        addObject(jumper,59,470);

        Coint coint7 = new Coint();
        addObject(coint7,408,455);
        Coint coint8 = new Coint();
        addObject(coint8,509,454);
 
        
        Coint coint9 = new Coint();
        addObject(coint9,913,287);
        coint9.setLocation(912,279);
        coint9.setLocation(912,279);
        

        BackMenu backMenu = new BackMenu();
        addObject(backMenu,911,57);

        Platform platform = new Platform();
        addObject(platform,49,560);

        Platform platform2 = new Platform();
        addObject(platform2,120,560);
        Platform platform3 = new Platform();
        addObject(platform3,106,283);
        Platform platform4 = new Platform();
        addObject(platform4,119,283);
        Platform platform5 = new Platform();
        addObject(platform5,298,560);
        Platform platform6 = new Platform();
        addObject(platform6,304,311);
        Platform platform7 = new Platform();
        addObject(platform7,398,560);
        Platform platform8 = new Platform();
        addObject(platform8,498,560);
        Platform platform9 = new Platform();
        addObject(platform9,588,560);
        Platform platform10 = new Platform();
        addObject(platform10,587,480);
        Platform platform11 = new Platform();
        addObject(platform11,811,560);
        platform11.setLocation(813,560);
        Platform platform12 = new Platform();
        addObject(platform12,829,560);
        Platform platform13 = new Platform();
        addObject(platform13,951,360);

        

               
        Crate crate2 = new Crate();
        addObject(crate2,559,495);
        Crate crate = new Crate();
        addObject(crate,510,495);
    }
}
