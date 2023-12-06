 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TutorialWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TutorialWorld extends World
{

    /**
     * Constructor for objects of class TutorialWorld.
     * 
     */
    public TutorialWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
        showText("Summary: You are Ezekiel, the Phoenix General.\n Your mission, as the savior,\n is to mow down waves of enemies\n for a minute to claim Victory", 250,250);
        
    }
}
