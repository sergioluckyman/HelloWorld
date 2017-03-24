package luxoft.zoo;

public class Cat extends  Zoon{
    private String color;
    //extends Zoon
    public  Cat(String name)
    {
        super(name);
        System.out.println("Cat's constructor");
    }
    public  Cat(String name, String color)
    {
        this(name);
        this.color = color;
        System.out.println("I am " + this.color);
    }
    public void produceSound()
    {
        System.out.println("Cat is saying myau-myau");
    }
    public void eat()
    {
        System.out.println("Cat is eating");
    }

    public void pur()
    {
        System.out.println("Cat is pur");
    }
}
