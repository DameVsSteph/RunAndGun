import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ezekial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ezekial extends Actor
{
    public int vSpeed;
    public int gravity = 2;
    
    public boolean jumping;
    public int jumpStrength = 60;
    
    public int speed = 5;
    
    private SimpleTimer shootingtimer = new SimpleTimer();
    
    private int facingDirection =1;
    
    public SimpleTimer winTimer = new SimpleTimer();
    
    /**
     * Act - do whatever the Ezekiel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        shoot();
        movement();
        
                if(isTouching(Road.class)){
        
        getWorld().removeObject(this);
        
        
        }
        
        
        
    }
    
    public void movement()
    {
        if(Greenfoot.isKeyDown("d"))
        {
            move(5);
            this.setImage("Ezekiel_-_big_2.png");
        }
        if(Greenfoot.isKeyDown("a"))
        {
            move(-5);
            this.setImage("Ezekiel_-_big_2_left.png");
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + 4);
            
        }
         if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() - 4);
            
        }
        
        
        
    }
    public void shoot()
    {
        
    
    
            
                if (shootingtimer.millisElapsed() > 350 && Greenfoot.isKeyDown("x"))
                {
                    World world = getWorld();
                    world.addObject( new  Bullet(), getX()+60, getY()+20);
                    shootingtimer.mark();
                }
            
    
}

    public void transitionToWin(){
        if (winTimer.millisElapsed()>60000)
        {
            

        }
        
    }
    
    
}
