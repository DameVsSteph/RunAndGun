import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{
double timeWelcomeScreenCreation = System.currentTimeMillis();
    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 

        prepare();
        int timerValue = (int) (System.currentTimeMillis() - timeWelcomeScreenCreation)/1000;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PlayButton playButton = new PlayButton();
        addObject(playButton,298,302);
        TutorialButton tutorialButton = new TutorialButton();
        addObject(tutorialButton,299,448);
        OptionButton optionButton = new OptionButton();
        addObject(optionButton,299,185);
        optionButton.setLocation(303,227);
        removeObject(optionButton);
        OptionButton optionButton2 = new OptionButton();
        addObject(optionButton2,294,159);
    }
    
    
}
    

