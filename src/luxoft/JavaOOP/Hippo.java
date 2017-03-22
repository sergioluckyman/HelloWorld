package luxoft.JavaOOP;

public class Hippo extends Animal {

  public Hippo(String animal_name)
    {
        super(animal_name);
    }
 public void say_name()
    {
        super.say_name();
        System.out.println("I am happy!");
    }
 public void roam()
    {
        System.out.println("Hippo roam!");
    }
 public void eat()
    {
        System.out.println("Hippo eat!");
    }

}
