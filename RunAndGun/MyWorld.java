import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Vector;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    
    private Vector velocity;
    private Vector acceleration;
    
    private static final double GRAVITY = 9.8 * 200; // 200 pixels is 1 meter
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 1000, 1); 
    }
    public void setVelocity(Vector newValue)
    {
        velocity = newValue;
    }
    
    
}
