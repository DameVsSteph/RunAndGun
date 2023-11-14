import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Ezekiel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ezekiel extends Actor
{
    
    private Vector velocity;
    private Vector acceleration;
    
    private static final double GRAVITY = 9.8 * 200; // 200 pixels is 1 meter
    
    /**
     * Act - do whatever the Ezekiel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("d"))
        {
            move(5);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            move(-5);
        }
        
        super.act();
        
    }
    
    
    
    
}
