import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Banana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banana extends Objek
{
    /**
     * Act - do whatever the Banana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer=0;
    public void act() 
    {
        setLocation(getX(), getY()+6);
        BananaFall();
    }
    
    public void BananaFall() {
        if(atWorldEdge()) {
            getWorld().removeObject(this); 
        }
    }
}
