import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(850,850, 1); 
        BananaAppear(); 
        prepare();
        BombAppear();
    }
    
    public void act() 
    {
        if(getObjects(Banana.class).isEmpty())BananaAppear();
        if(getObjects(Bomb.class).isEmpty())BombAppear();
    }
    
    private void prepare()
    {
        Monkey monkey = new Monkey();
        addObject(monkey, 648, 403);
        Counter counter = new Counter();
        addObject(counter, 57, 69);
        Score score = new Score();
        addObject(score, 64, 44);
        score.setLocation(59, 44);
        monkey.setLocation(427,564);
    }
    
    public void BananaAppear()
    {
        if(Greenfoot.getRandomNumber(2) < 50) {
        addObject(new Banana(), Greenfoot.getRandomNumber(519), 20);
        }
    }
    
    public void BombAppear()
    {
        if(Greenfoot.getRandomNumber(2) < 50) {
        addObject(new Bomb(), Greenfoot.getRandomNumber(519), 21);
        }
    }
}