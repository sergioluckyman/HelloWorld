package luxoft.vehicle;

import luxoft.zoo.Flyer;

public class Aircraft implements Flyer
{
    //implements Flyer
    public void fly()
    {
        System.out.println("Duck is fly");
    }
    public void land()
    {
        System.out.println("Duck is land");
    }
    public void takeoff()
    {
        System.out.println("Duck is takeoff");
    }
}
