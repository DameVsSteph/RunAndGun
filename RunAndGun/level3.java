import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level3 extends SimulationWorld
{
    int map [] [] = {       {0,0,0,0,0,0,0,0,0,0,0},
            {1,2,0,0,3,1,1,1,1,2,0},
            {0,1,0,0,1,0,0,0,0,1,0},
            {0,1,0,3,4,0,0,0,0,1,0},
            {0,1,0,1,0,0,0,0,0,1,0},
            {0,1,0,1,0,0,0,0,0,1,0},
            {0,1,0,1,0,0,0,0,0,1,0},
            {0,3,1,4,0,0,0,0,0,1,0},                     
            {0,0,0,0,0,0,0,0,0,1,0},
            {0,0,0,0,0,0,0,0,0,1,0},
        };
        public SimpleTimer winTimer = new SimpleTimer();

    int worldTime;                      
    private GreenfootSound backgroundMusic = new GreenfootSound("Adrenaline.mp3");
    
    /**
     * Constructor for objects of class level3.
     * 
     */
    public level3()
    {

        worldTime++;

        Level3();
        prepare();
    }
    
    
    
    
    
    public void act(){
        worldTime++;
        wave();
        backgroundMusic.playLoop();
        Win();
        
    }
    private void Level3(){
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(map[j][i] == 1){
                    addObject(new Road(true), 30 + i * 60,30 + j * 60);

                }
                if(map[j][i] == 2){
                    addObject(new Road(90), 30 + i * 60,30 + j * 60);

                }
                if(map[j][i] == 3){
                    addObject(new Road(0), 30 + i * 60,30 + j * 60);

                }
                if(map[j][i] == 4){
                    addObject(new Road(270), 30 + i * 60,30 + j * 60);

                }
            }

        }
        
    }

    public void wave(){
        if(worldTime % 500 == 0){
            addObject(new HeavyGunner(),1,90);
        }
        else if(worldTime % 20 == 0){

            addObject(new MolszianGrunt(), 1 ,90);

        }

    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ezekial ezekial = new Ezekial();
        addObject(ezekial,389,329);
    }
   public void Win(){
     if(winTimer.millisElapsed() > 60000){
        
        World winWorld = new WinWorld();
        Greenfoot.setWorld(winWorld);
        }
}
}
