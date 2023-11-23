import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MolszianGrunt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MolszianGrunt extends Actor
{
    public int vSpeed;
    public int gravity = 2;
    
    public boolean jumping;
    public int jumpStrength = 60;
    
    public int speed = 5;
    /**
     * Act - do whatever the MolszianGrunt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        fall();
        movement();
        jump();
    }
    public void movement()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            move(5);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            move(-5);
        }
        if(Greenfoot.isKeyDown("p") && jumping == false){
            jump();
        }
        
        if(Greenfoot.isKeyDown("u")){
            getWorld().addObject(new Bullet(), getX(), getY());
            
        }
    }
    
    public void checkFall(){
        if(onGround() == true)
        vSpeed = 0;
        else
        fall();
        
    }
    
    
    public void fall(){
        
        setLocation(getX(), getY() + vSpeed);
        if(vSpeed <= 12)
        vSpeed = vSpeed + gravity;
        
        jumping = true;
        
    }
    
    public boolean onGround(){
        int spriteHeight = getImage().getHeight();
        int lookForGround = spriteHeight/2;
        
        Actor ground = getOneObjectAtOffset(0, lookForGround, Platform.class);
        if( ground == null)
        {
            jumping = true;
            return false;
    }
        else{
            moveToGround(ground); 
            return true;
        }
        
        
    }
    
    public void moveToGround(Actor ground){
        int groundHeight = ground.getImage().getHeight();
        int newY = ground.getY() - (groundHeight + getImage().getHeight())/2;
        
        setLocation(getX(), newY);
        jumping = false;
        
        
    }
    
    public void jump(){
        vSpeed = vSpeed - jumpStrength;
        jumping = true;
        fall();
        
    }
}