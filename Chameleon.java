import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ned here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chameleon extends ScrollingActor
{
    public Chameleon()
    {
        super("images/Chameleon", ".png", 14, 150);
    }
    

    public void act() 
    {
        getWorld().addObject(new SpeechBubble("jump-bubble.png", this, 5));

        animate();
        
        super.act();
        
        
    } 
    
}
