import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jumper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jumper extends Actor
{
    private final int GRAVITY = 1;
    private final int STEP = 3;
    private int velocity;
    
    
    public static int jumlahKunci = 0;
    public static int jumlahPeti = 0;
    
    //public static int nyawa = 3;
    int nyawa = 3;
    public int coint = 0;
    int peta = 0;
    
    private GreenfootImage Stay = new GreenfootImage("character_femaleAdventurer_hold.png");
    private GreenfootImage right1 = new GreenfootImage("right1.png");
    private GreenfootImage right2 = new GreenfootImage("right2.png");
    private GreenfootImage right3 = new GreenfootImage("right3.png");
    private GreenfootImage right4 = new GreenfootImage("right4.png");
    private GreenfootImage right5 = new GreenfootImage("right5.png");
    
    private GreenfootImage left1 = new GreenfootImage("left1.png");
    private GreenfootImage left2 = new GreenfootImage("left2.png");
    private GreenfootImage left3 = new GreenfootImage("left3.png");
    private GreenfootImage left4 = new GreenfootImage("left4.png");
    private GreenfootImage left5 = new GreenfootImage("left5.png");
    
    private GreenfootImage panjat1 = new GreenfootImage("Manjat1.png");
    private GreenfootImage panjat2 = new GreenfootImage("Manjat2.png");
    private GreenfootImage panjat3 = new GreenfootImage("Manjat3.png");
    
    private int frame = 1;
    
    
    public Jumper(int width, int height)
    {
        GreenfootImage image = getImage();
        image.scale(width, height);
        setImage(image);
        setImage("character_femaleAdventurer_hold.png");
    }
    
    public Jumper()
    {
        velocity = 0;
    }
    
    public void act()
    {
        fall();
        move();
        getCoint();
        getPeta();
        nyawa();
        tampil();
        finish();
        getKey();
        getPeti();
        if ( Greenfoot.isKeyDown("space") && isOnSolidGround()) jump();
        
        if(Greenfoot.mousePressed(this))
        {
            int y = getY();
            isOnLadder(); 
            y -= STEP;
        }
        
        if(Greenfoot.mousePressed(null)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            int mouseX = mouse.getX();
            int myX = this.getX();
            int mouseY = mouse.getY();
            int myY = this.getY();
            if (mouseX > myX) {
                move(8);
                animateRight();
                canMoveRight();
            }
            if (mouseX < myX) {
                move(-8);
                animateLeft();
                canMoveLeft();
            }
            if (mouseY < myY) {
                isOnSolidGround();
                jump();
            }
        }
    }
    
    public void memanjatTangga()
    {
        if(frame == 1)
        {
            setImage(Stay);
        }
        else if(frame == 2)
        {
            setImage(panjat1);
        }
        else if(frame == 3)
        {
            setImage(panjat2);
        }
        else if(frame == 4)
        {
            setImage(panjat3);
            frame =1;
            return;
        }
        
        frame ++;
    }
    
    public void animateRight()
    {
        if(frame == 1)
        {
            setImage(Stay);
        }
        else if(frame == 2)
        {
            setImage(right1);
        }
        else if(frame == 3)
        {
            setImage(right2);
        }
        else if(frame == 4)
        {
            setImage(right3);
        }
        else if(frame == 4)
        {
            setImage(right4);
        }
        else if(frame == 5)
        {
            setImage(right5);
            frame =1;
            return;
        }
        
        frame ++;
    }
    
    public void animateLeft()
    {
        if(frame == 1)
        {
            setImage(Stay);
        }
        else if(frame == 2)
        {
            setImage(left1);
        }
        else if(frame == 3)
        {
            setImage(left2);
        }
        else if(frame == 4)
        {
            setImage(left3);
        }
        else if(frame == 4)
        {
            setImage(left4);
        }
        else if(frame == 5)
        {
            setImage(left5);
            frame =1;
            return;
        }
        
        frame ++;
    }
    
    public void nyawa()
    {
        if(isTouching(Mace.class))
        {
            setLocation(59,453);
            nyawa = nyawa -1;
            Greenfoot.playSound("touchobstacle.wav");
            if(nyawa < 1) {
                Greenfoot.setWorld(new GameOver());
                Greenfoot.playSound("lose.wav");
            }
        }
        
        if(isTouching(MaceTwo.class))
        {
            setLocation(59,453);
            nyawa = nyawa -1;
            Greenfoot.playSound("touchobstacle.wav");
            if(nyawa < 1) {
                Greenfoot.setWorld(new GameOver());
                Greenfoot.playSound("lose.wav");
            }
        }
        
        if(isTouching(Water.class))
        {
            setLocation(59,453);
            nyawa = nyawa -1;
            Greenfoot.playSound("touchobstacle.wav");
            if(nyawa < 1) {
                Greenfoot.setWorld(new GameOver());
                Greenfoot.playSound("lose.wav");
            }
        }
    }
    
    public void tampil()
    {
        getWorld().showText("Nyawa = "+ nyawa, 250, 27);
        
        getWorld().showText("Coint = "+ coint, 90, 27);
        
        getWorld().showText("Peta = "+ peta, 95, 60);
        
    }
    
    public void getCoint()
    {
        Actor getCoint = getOneIntersectingObject(Coint.class);
        if(getCoint != null)
        {
            getWorld().removeObject(getCoint);
            Greenfoot.playSound("getcoint.wav");
            coint = coint + 100;
        }
    }
    
    public void getPeta()
    {
        Actor getPeta = getOneIntersectingObject(Peta.class);
        if(getPeta != null)
        {
            getWorld().removeObject(getPeta);
            Greenfoot.playSound("getcoint.wav");
            peta = peta + 1;
        }
    }
    
    public void finish()
    {
        if( peta >= 1 && isTouching(Finish.class))
        {
            Level2 worldbaru = new Level2();
            Greenfoot.setWorld(worldbaru);
            Greenfoot.playSound("finish.wav");
        }
        
        if( peta >= 1 && isTouching(Finish2.class))
        {
            Level3 worldbaru = new Level3();
            Greenfoot.setWorld(worldbaru);
            Greenfoot.playSound("finish.wav");
        }
        
        if( peta >= 1 && isTouching(Finish3.class))
        {
            Level4 worldbaru = new Level4();
            Greenfoot.setWorld(worldbaru);
            Greenfoot.playSound("finish.wav");
        }
        
        if( peta >= 1 && isTouching(Finish4.class))
        {
            Level5 worldbaru = new Level5();
            Greenfoot.setWorld(worldbaru);
            Greenfoot.playSound("finish.wav");
        }
    }
    
    public void getKey()
    {
        Actor getKey = getOneIntersectingObject(Key.class);
        if(getKey != null)
        {
            getWorld().removeObject(getKey);
            Greenfoot.playSound("getcoint.wav");
            getWorld().addObject(new TreasureChest(), 631,430);
            
            jumlahKunci++;
        }
    }
    
    public void getPeti()
    {
        Actor getPeti = getOneIntersectingObject(TreasureChest.class);
        if(getPeti != null)
        {
            getWorld().removeObject(getPeti);
            Greenfoot.playSound("136441__iod14__champion-fun.mp3");
            Winner worldbaru = new Winner();
            Greenfoot.setWorld(worldbaru);
            
            jumlahPeti++;
        }
    }
    
    public void fall()
    {
        setLocation(getX(), getY() + velocity);
        if (isOnSolidGround()) {
            velocity = 0;
            
            while (isOnSolidGround()) {
                setLocation(getX(), getY() -1);
            }
            
            setLocation(getX(), getY() + 1);
        }
        
        else if (velocity < 0 && didBumpHead()) {
            velocity = 0;
            
            while (didBumpHead()) 
            {
                setLocation(getX(), getY() + 1);
            }
        }
        else if (isOnLadder() && velocity >= 0 ) {
            velocity = 0;
        }
        else velocity += GRAVITY;
    }
    
    public void jump()
    {
        velocity = -20;
    }
    
    public void move()
    {
        int y = getY();
        int x = getX();
        
        if(Greenfoot.isKeyDown("left") && canMoveLeft())
        {
             x -= STEP;
             animateLeft();
        }
        if(Greenfoot.isKeyDown("right") && canMoveRight()) 
        {
            x += STEP;
            animateRight();
        }
        if(Greenfoot.isKeyDown("up") && isOnLadder())
        {
            y -= STEP;
            memanjatTangga();
        }
        if(Greenfoot.isKeyDown("down") && isOnLadder()) 
        {
            y += STEP;
            memanjatTangga();
        }
        
        setLocation(x, y);
    }
    
    public boolean isOnSolidGround()
    {
        boolean isOnGround = false;
        
        if (getY() > getWorld().getHeight() - 50) isOnGround = true;
        
        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        
        if (getOneObjectAtOffset(imageWidth / -2, imageHeight / 2, Platform.class) != null || 
            getOneObjectAtOffset(imageWidth / 2, imageHeight / 2, Platform.class) != null)
            isOnGround = true;
        
        return isOnGround;
    }
    
    public boolean didBumpHead() {
        boolean bumpedHead = false;
        
        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        
        if (getOneObjectAtOffset(imageWidth / -2, imageHeight / -2, Platform.class) != null || 
            getOneObjectAtOffset(imageWidth / 2, imageHeight / -2, Platform.class) != null)
            bumpedHead = true;
            
        return bumpedHead;
    }
    
    public boolean canMoveLeft() 
    {
        boolean canMoveLeft = true;
        
        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        
        if (getOneObjectAtOffset(imageWidth / -2 - STEP, imageHeight / -2, Platform.class) != null || 
            getOneObjectAtOffset(imageWidth / -2 - STEP, imageHeight / 2 -1, Platform.class) != null)
            canMoveLeft= false;
            
        return canMoveLeft;
    }
    
    public boolean canMoveRight()
    {
        boolean canMoveRight = true;
        
        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        
        if (getOneObjectAtOffset(imageWidth / 2 + STEP, imageHeight / -2, Platform.class) != null || 
            getOneObjectAtOffset(imageWidth / 2 + STEP, imageHeight / 2 -1, Platform.class) != null)
            canMoveRight= false;
            
        return canMoveRight;    
    }
    
    public boolean isOnLadder()
    {
        return isTouching(Ladder.class);
    }
}
