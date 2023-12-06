import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TutorialButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TutorialButton extends Actor
{
    /**
     * Act - do whatever the TutorialButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            transitionToTutorialWorld();
        }
    }
    
    public void transitionToTutorialWorld(){
        World tutorialWorld = new TutorialWorld();
        Greenfoot.setWorld(tutorialWorld);
    }
}
