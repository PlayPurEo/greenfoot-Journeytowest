import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Strawberry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Strawberry extends items
{
    /**
     * Act - do whatever the Strawberry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Strawberry()
    {
       GreenfootImage image = getImage();
       image.scale(35,35);
       setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
