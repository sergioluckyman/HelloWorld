package luxoft.zoo;

public class Duck extends Zoon implements Flyer{
    //extends Zoon
    public void produceSound()
    {
        System.out.println("Duck is crya-crya");
    }
    public void eat()
    {
        System.out.println("Duck is eating");
    }
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
