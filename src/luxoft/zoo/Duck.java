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
