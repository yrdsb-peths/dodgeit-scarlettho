import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Hero extends Actor
{
    boolean top = false;
    public void act()
    {
        if(Greenfoot.mouseClicked(null))
        {
            top = !top;
        }
        if(top)
        {
            setLocation(100, 100);
        }
        else
        {
            setLocation(100, 300);
        }
    }
}
