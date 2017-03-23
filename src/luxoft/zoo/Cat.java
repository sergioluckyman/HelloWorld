package luxoft.zoo;

public class Cat extends  Zoon{
    //extends Zoon
    public  Cat(String name)
    {
        super();
        System.out.println("Cat's constructor");
        this.setName(name);
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
