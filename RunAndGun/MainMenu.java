import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{

    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 

        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        PlayButton playButton = new PlayButton();
        addObject(playButton,308,145);
        playButton.setLocation(308,145);
        OptionButton optionButton = new OptionButton();
        addObject(optionButton,310,320);
        optionButton.setLocation(310,320);
        TutorialButton tutorialButton = new TutorialButton();
        addObject(tutorialButton,312,471);
    }
    
    
}
    

