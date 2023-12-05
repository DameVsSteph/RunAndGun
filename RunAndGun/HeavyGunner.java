import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HeavyGunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HeavyGunner extends Actor
{
    /**
     * Act - do whatever the HeavyGunner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        getImage().scale(80, 80);
        Movement();
    }
    
    public void Movement(){
    
         if(Greenfoot.isKeyDown("left")){
         move(-5);
    }
    if(Greenfoot.isKeyDown("right")){
         move(5);
    }

}
}