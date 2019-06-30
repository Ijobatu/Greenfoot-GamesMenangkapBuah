import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monkey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monkey extends Objek
{
    /**
     * Act - do whatever the Monkey wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Monkey() {
        this.getImage().scale(150,150);
    }
    
    public void act() 
    {
        moveMonkey();
        objectDisappear();
    }
    
    public void objectDisappear()
    {
        if(canSee(Banana.class)) {
            eat(Banana.class);((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(10);
        }
    }
    
    public void moveMonkey() {
        if(Greenfoot.isKeyDown("left")) {
            setLocation(getX() - 7, getY());
        }
        else if(Greenfoot.isKeyDown("right")) {
            setLocation(getX() + 7, getY());
        }
    }
    
}