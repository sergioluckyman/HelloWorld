package luxoft.vehicle;

import luxoft.zoo.Flyer;

public class Aircraft implements Flyer
{
    //implements Flyer
    public void fly()
    {
        fly(3);
    }
    public void fly(int height)
    {
        System.out.println("Duck is fly. Height = " + height);
    }

    public void fly(int height, int weight)
    {
        System.out.println("Duck is fly. Height = " + height + " Weight = " + weight);
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
