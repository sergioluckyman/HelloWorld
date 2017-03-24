package luxoft.zoo;

public abstract class Zoon {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    /*void setName(String name) {
        this.name = name;
    }*/

    public String getName() {
        return name;
    }

    Zoon(String name)
    {
        this.name = name;
        //System.out.println("Zoon constructor");
        System.out.println("Zoon's name is " + this.name);
    }

    Zoon(String name, int age)
    {
       this(name);
       this.age = age;
    }
   /* Methods*/
    public abstract void produceSound();

    public abstract void eat();

}
