import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AboutMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AboutMenu extends World
{

    /**
     * Constructor for objects of class AboutMenu.
     * 
     */
    public AboutMenu()
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
        Back back = new Back();
        addObject(back,112,108);
        back.setLocation(96,61);
        NameAbout nameAbout = new NameAbout();
        addObject(nameAbout,476,108);

        MyBiodata4 myBiodata4 = new MyBiodata4();
        addObject(myBiodata4,228,191);
        DosenPembimbing dosenPembimbing = new DosenPembimbing();
        addObject(dosenPembimbing,298,245);
        NamaMahasiswa namaMahasiswa = new NamaMahasiswa();
        addObject(namaMahasiswa,216,306);
        namaMahasiswa.setLocation(220,307);
        NamaSaya namaSaya = new NamaSaya();
        addObject(namaSaya,220,356);
        Plang plang = new Plang();
        addObject(plang,690,195);

        LogoOracle logoOracle = new LogoOracle();
        addObject(logoOracle,676,475);
        LogoGreenfoot logoGreenfoot = new LogoGreenfoot();
        addObject(logoGreenfoot,415,476);

        logoGreenfoot.setLocation(857,475);
        Craftpix craftpix = new Craftpix();
        addObject(craftpix,649,236);
        craftpix.setLocation(649,251);
        Kenney kenney = new Kenney();
        addObject(kenney,645,289);
        AssetStore assetStore = new AssetStore();
        addObject(assetStore,661,324);
        GameArt2D gameArt2D = new GameArt2D();
        addObject(gameArt2D,668,355);
        Freesound freesound = new Freesound();
        addObject(freesound,662,386);
        Kelas kelas = new Kelas();
        addObject(kelas,250,402);
        Kampus kampus = new Kampus();
        addObject(kampus,257,449);
    }
}
