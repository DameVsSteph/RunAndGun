import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class MolszianGrunt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MolszianGrunt extends Actor
{
    
    /**
     * Act - do whatever the MolszianGrunt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(3);
        List <Road> road90 = getObjectsAtOffset(-30, 0, Road.class);
        for(Road roads : road90){
             if(roads.straight == false && getRotation() == 0){
                
                setRotation(roads.turn);
                
                
                }
        }
        List <Road> road0 = getObjectsAtOffset(0, -30, Road.class);
        for(Road roads : road0){
             if(roads.straight == false && getRotation() == 90){
                
                setRotation(roads.turn);
                
                
                }
        }
        List <Road> road180 = getObjectsAtOffset(0, 30, Road.class);
        for(Road roads : road180){
             if(roads.straight == false && getRotation() == 270){
                
                setRotation(roads.turn);
                
                
                }
        }
        List <Road> road270 = getObjectsAtOffset(30, 0, Road.class);
        for(Road roads : road270){
             if(roads.straight == false && getRotation() == 180){
                
                setRotation(roads.turn);
                
                
                }
        }

        
        
        
        Dead();
        
    }
    
    
    
    
    public void Dead(){
    
    Actor bullet = getOneIntersectingObject(Bullet.class);
    if(bullet != null){
     getWorld().removeObject(this);
    }
    
    
    }
}
