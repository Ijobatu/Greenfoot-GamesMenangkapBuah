import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int totalCount = 0;
    public void act() 
    {
        gameOver();
    }
    
    public Counter() {
        setImage(new GreenfootImage("0", 30, Color.BLACK, Color.WHITE));
    }
    
    public void Counting(int hitung) {
        totalCount += hitung;
        setImage(new GreenfootImage("" + totalCount, 30, Color.BLACK, Color.WHITE));
    }
    
    public void gameOver() {
        if(totalCount >= 80) {
            Greenfoot.stop();
            System.out.println("CONGRATULATION! YOU WIN! click ClOSE button and Reset to play again");
        }
    }
}
