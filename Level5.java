import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level5 extends World
{

    /**
     * Constructor for objects of class Level5.
     * 
     */
    public Level5()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        prepare();
        setBackground("BG.png");
    }
    

    public void prepare()
    {

        Ladder ladder = new Ladder();
        addObject(ladder,29,420);

        Directions directions = new Directions();
        addObject(directions,115,489);

        Crate crate = new Crate();
        addObject(crate,100,223);
        Bush bush = new Bush();
        addObject(bush,115,223);

        Tree2 tree2 = new Tree2();
        addObject(tree2,392,505);
        Mushroom mushroom = new Mushroom();
        addObject(mushroom,309,364);


        Tree tree = new Tree();
        addObject(tree,623,390);

        Crate crate2 = new Crate();
        addObject(crate2,600,505);
        Crate crate3 = new Crate();
        addObject(crate3,653,505);

        Crate crate4 = new Crate();
        addObject(crate4,692,220);

        Mushroom mushroom2 = new Mushroom();
        addObject(mushroom2,914,260);
        Bush bush4 = new Bush();
        addObject(bush4,938,260);
        Key key = new Key();
        addObject(key,925,150);

        MaceTwo maceTwo = new MaceTwo();
        addObject(maceTwo,315,178);
        maceTwo.setLocation(296,174);
        MaceTwo maceTwo2 = new MaceTwo();
        addObject(maceTwo2,933,418);
        MaceTwo maceTwo3 = new MaceTwo();
        addObject(maceTwo3,498,322);
        MaceTwo maceTwo4 = new MaceTwo();
        addObject(maceTwo4,497,202);

        Water water = new Water();
        addObject(water,202,573);
        Water water2 = new Water();
        addObject(water2,248,574);
        Water water3 = new Water();
        addObject(water3,501,582);
        Water water4 = new Water();
        addObject(water4,757,585);
        Water water5 = new Water();
        addObject(water5,862,585);
        Water water6 = new Water();
        addObject(water6,967,585);

        Mace mace = new Mace();
        addObject(mace,198,434);
        Mace mace2 = new Mace();
        addObject(mace2,499,540);
        Mace mace3 = new Mace();
        addObject(mace3,784,528);
        Mace mace4 = new Mace();
        addObject(mace4,864,531);
        Mace mace5 = new Mace();
        addObject(mace5,940,527);
        mace5.setLocation(942,531);

        removeObject(crate4);

        BackMenu backMenu = new BackMenu();
        addObject(backMenu,911,57);

        Platform platform = new Platform();
        addObject(platform,50,560);
        Platform platform2 = new Platform();
        addObject(platform2,100,560);
        Platform platform3 = new Platform();
        addObject(platform3,106,287);
        Platform platform4 = new Platform();
        addObject(platform4,206,342);
        Platform platform5 = new Platform();
        addObject(platform5,308,422);
        Platform platform6 = new Platform();
        addObject(platform6,350,564);
        platform6.setLocation(350,564);
        Platform platform7 = new Platform();
        addObject(platform7,400,564);
        Platform platform8 = new Platform();
        addObject(platform8,605,568);
        Platform platform9 = new Platform();
        addObject(platform9,654,568);
        Platform platform10 = new Platform();
        addObject(platform10,802,421);
        Platform platform11 = new Platform();
        addObject(platform11,931,324);

        Coint coint = new Coint();
        addObject(coint,99,153);
        Coint coint2 = new Coint();
        addObject(coint2,205,245);
        Coint coint3 = new Coint();
        addObject(coint3,311,309);
        Coint coint4 = new Coint();
        addObject(coint4,398,432);
        Coint coint5 = new Coint();
        addObject(coint5,624,437);
        Coint coint6 = new Coint();
        addObject(coint6,799,329);
        Coint coint7 = new Coint();
        addObject(coint7,926,193);

        Jumper jumper = new Jumper(80, 100);
        addObject(jumper,59,469);
        maceTwo.setLocation(400,195);
    }
}
